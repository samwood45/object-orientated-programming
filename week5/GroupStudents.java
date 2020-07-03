public class GroupStudents
{

   public static void print(Student [] students)
   {
      for(Student student : students)
      {
         System.out.println(student);
      }
   }

   public static void swap(SortableThing [] items, int i, int j)
   {
      SortableThing tmp = items[i];
      items[i] = items[j];
      items[j] = tmp;

   }

   public static void sort(SortableThing [] items)
   {
      for(int pass = 0; pass< items.length -1; pass++)
      {
         int smallest = pass;
         for(int i = pass+1; i < items.length; i++)
            if(items[i].lessThan(items[smallest]))
               smallest = i;

            swap(items, pass, smallest);
      }
   }

   //public static void sortByMark(Student [] students)
   //{
     // for(int pass = 0; pass < students.length - 1; pass++)
      //{
       //  int smallest = pass;
       //  for(int i = pass+1; i < students.length; i++)
        //    if(students[i].getname().con)
      //} 
   //}
   public static void main(String [] args)
   {
      Student [] group = {
               new Student("John", 50),
               new Student("Abby", 40),
               new Student("Dylan", 20),
               new Student("Carl", 70),
               new Student("Maeve", 70),
               new Student("Chris", 46),
               new Student("James", 55),
               new Student("Anne", 63),
            };

      print(group);
      System.out.println("-----------");
      sort(group);
      print(group);
   }
}   