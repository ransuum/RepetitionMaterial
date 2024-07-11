package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<UniversityMember> universityMembers = new ArrayList<>();

    public void addUniversityMember(UniversityMember universityMember) {
        universityMembers.add(universityMember);
    }

    public void accept(Visitor visitor){
        for(UniversityMember universityMember : universityMembers){
            universityMember.accept(visitor);
        }
    }

    public List<UniversityMember> getUniversityMembers() {
        return universityMembers;
    }

    public void setUniversityMembers(List<UniversityMember> universityMembers) {
        this.universityMembers = universityMembers;
    }
}
