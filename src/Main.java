public class Main {

    public static void main(String[] args) {

        // Create JobService object
        JobService service = new JobService();



        // Create Job objects
        Job job1 = new Job(
                1,
                "Java Developer",
                "Backend Development",
                50000,
                "TechCorp",
                "Delhi"
        );

        Job job2 = new Job(
                2,
                "Frontend Developer",
                "React Development",
                45000,
                "WebSolutions",
                "Mumbai"
        );

        Job job3 = new Job(
                3,
                "Full Stack Developer",
                "Frontend + Backend",
                70000,
                "CodeBase",
                "Bangalore"
        );
        // Add Jobs
        service.addJob(job1);
        service.addJob(job2);
        service.addJob(job3);


        // Display All Jobs
        System.out.println("===== ALL JOBS =====");
        service.getAllJobs();

        // Get Job By ID
        System.out.println("\n===== JOB WITH ID 2 =====");
        service.getJobById(2);



        // Update Existing Job
        Job updatedJob = new Job(
                2,
                "Senior Frontend Developer",
                "React + NextJS",
                80000,
                "WebSolutions",
                "Mumbai"
        );
        service.updateJob(updatedJob);



        // Display After Update
        System.out.println("\n===== AFTER UPDATE =====");
        service.getAllJobs();



        // Search By Name
        System.out.println("\n===== SEARCH JOB =====");
        service.searchJobByName("Java Developer");

        // Delete Job
        service.deleteJobById(1);

        // Display After Deletion
        System.out.println("\n===== AFTER DELETION =====");
        service.getAllJobs();
    }
}
