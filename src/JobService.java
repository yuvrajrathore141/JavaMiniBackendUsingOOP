import java.util.ArrayList;

public class JobService {
    //ArrayList for object Storage
    ArrayList<Job> jobs = new ArrayList<Job>();
    //addJob Method
    void addJob(Job job) {
        jobs.add(job);
    }
    //getAllJobs Method
    void getAllJobs(){
        for(Job job : jobs){
            System.out.println(job.toString());
        }
    }
    //getJobById Method
    void getJobById(int id){
        for(Job job : jobs){
            if(id == job.getJobId()){
                System.out.println(job.toString());
                break;
            }
        }
    }
    //deleteJobById Method
    void deleteJobById(int id){
        jobs.removeIf(job -> id == job.getJobId());
    }
    //updateJobById Method
    void updateJob(Job job){
        for(Job job1 : jobs){
            if(job.getJobId() == job1.getJobId()){
                job1.setJobId(job.getJobId());
                job1.setJobTitle(job.getJobTitle());
                job1.setJobDescription(job.getJobDescription());
                job1.setCompanyAddress(job.getCompanyAddress());
                job1.setCompanyName(job.getCompanyName());
                job1.setSalary(job.getSalary());
            }
        }
    }
    //searchJobByName Method
    void searchJobByName(String name){
        for(Job job : jobs){
            if(job.getJobTitle().equals(name)){
                System.out.println(job.toString());
            }
        }
    }
}
