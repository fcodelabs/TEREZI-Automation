package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

import java.util.List;

public class project extends WebPageBase {

    //projects section components
    public String btnCreateProject = "xpath=(//button[normalize-space()='Create Project'])[1]";
    public String SearchProject = "xpath=//input[@placeholder='Search']";
    public String SearchProjectResults = "xpath=(//a[@class='MuiButtonBase-root MuiCardActionArea-root css-1m5f78l'])[1]";
    public String formCreateProject = "xpath=//div[@class='MuiBox-root css-1jp4s0u']";
    public String TabActiveProjects = "xpath=//button[normalize-space()='Active']";
    public String TabCompletedProjects = "xpath=//button[normalize-space()='Completed']";
    public String FilterByProjectType = "xpath=//div[normalize-space()='Filter by Project Type']";
    public String FilterByStatus = "xpath=//div[normalize-space()='Filter by Status']";
    //project Edit form components
    public String btnEditProject = "xpath=//button[normalize-space()='Edit']";
    public String InputFieldEditProjectName = "xpath=(//input[@id=':r2:'])[1]";
    public String InputFieldEditClientName = "xpath=(//input[@id=':r3:'])[1]";
    public String DropDownEditProjectType = "xpath=//div[normalize-space()='Time & Material with Budget Cap']";
    public String InputFieldEditTentativeStart = "xpath=(//input[@id=':r5:'])[1]";
    public String InputFieldEditTentativeEnd = "xpath=//input[@id=':r7:']";
    public String InputFieldEditHypercarePeriod = "xpath=(//input[@id=':r9:'])[1]";
    public String InputFieldEditProjectManager = "xpath=(//input[@id=':ra:'])[1]";
    public String InputFieldEditProjectAllocation = "xpath=(//input[@id=':rc:'])[1]";
    public String btnEditProjectCancel = "xpath=//button[normalize-space()='Cancel']";
    public String btnEditProjectSave = "xpath=(//button[normalize-space()='Confirm'])[1]";
    //project details page components
    public String SearchProjectMember = "xpath=//input[@id='search-bar']";
    public String SearchProjectMemberResults = "xpath=//p[normalize-space()='Dasun Hettiarachchi']";
    public String FilterByMemberRole ="xpath=(//div[@role='combobox'])[1]";
    public String FilterResultForRoleAIMLEngineer = "xpath=//span[normalize-space()='AI/ML Engineer']";
    public String FilterResultForRoleAccountManager = "xpath=//span[normalize-space()='Account Manager']";
    public String FilterResultForRoleBackendDeveloper = "xpath=//span[normalize-space()='Backend Developer']";
    public String FilterResultForRoleBusinessAnalyst = "xpath=//span[normalize-space()='Business Analyst']";
    public String FilterResultForRoleDevOps = "xpath=//span[normalize-space()='DevOps']";
    public String FilterResultForFrontendDeveloper = "xpath=//span[normalize-space()='Frontend Developer']";
    public String FilterResultForFullStackDeveloper = "xpath=//span[normalize-space()='Full Stack Developer']";
    public String FilterResultForMobileDeveloper = "xpath=//span[normalize-space()='Mobile Developer']";
    public String FilterResultForProjectManager = "xpath=//span[normalize-space()='Project Manager']";
    public String FilterResultForQAAutomation= "xpath=//span[normalize-space()='QA - Automation']";
    public String FilterResultForQAManual = "xpath=//span[normalize-space()='QA - Manual']";
    public String FilterResultForReviewerBackend = "xpath=//span[normalize-space()='Reviewer - Backend']";
    public String FilterResultForReviewerFrontend = "xpath=//span[normalize-space()='Reviewer - Frontend']";
    public String FilterResultForReviewerMobile ="xpath=//span[normalize-space()='Reviewers - Mobile']";
    public String FilterResultForScrumMaster ="xpath=//span[normalize-space()='Scrum Master']";
    public String FilterResultForTechLead ="xpath=//span[normalize-space()='Technical lead']";

    public String btnAddProjectMember = "xpath=(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-colorPrimary css-1g33xf3'])[1]";
    public String InputFieldAddMemberName = "xpath=//input[@id=':r11:']";
    public String SelectFirstOptionInDropDown = "xpath=div[class='MuiBox-root css-18mgonu'] div:nth-child(3)";
    public String InputFieldAddMemberRole = "xpath(//input[@id=':r13:'])[1]";
    public String InputFieldResourceStart = "xpath=(//input[@id=':r15:'])[1]";
    public String InputFieldResourceEnd = "xpath=(//input[@id=':r17:'])[1]";
    public String InputFieldAllocation = "xpath=(//input[@id=':r1k:'])[1]";
    public String btnAddMemberCancel = "xpath=//button[normalize-space()='Cancel']";
    public String btnAddMemberSave = "xpath=//button[@id=':rk:']";
    public String CheckBoxMoreThanForty = "xpath=(//input[@type='checkbox'])[3]";
    //create new project form components
    public String InputFieldProjectName = "xpath=//input[@id=':r2:']";
    public String InputFieldClientName = "xpath=//input[@id=':r3:']";
    public String DropDownProjectType = "xpath=//div[normalize-space()='Fixed-Time Fixed-Cost Project']";
    public String InputFieldProjectTypeFTFC = "xpath=//div[normalize-space()='Fixed-Time Fixed-Cost Project']";
    public String InputFieldProjectTypeTM = "xpath=//li[normalize-space()='Time & Material Project']";
    public String InputFieldProjectTypeTMCap = "xpath=//li[normalize-space()='Time & Material with Budget Cap']";
    public String InputFieldTentativeStart = "xpath=//input[@id=':r5:']";
    public String InputFieldTentativeEnd = "xpath=//input[@id=':r7:']";
    public String InputFieldHypercarePeriod = "xpath=//input[@id=':r9:']";
    public String InputFieldProjectManager = "xpath=//input[@id=':ra:']";
    public String InputFieldProjectManagerAllocation = "xpath=(//input[@id=':r1q:'])[1]";
    public String btnNewProjectCancel = "xpath=//input[@id=':rq:']";
    public String btnNewProjectSave = "xpath=//button[normalize-space()='Save']";

    //Filter by Project components
    public String btnFilterByProjectType = "xpath=//div[normalize-space()='Filter by Project Type']";
    public String FilterByProjectTypeOptionFTFC = "xpath=//li[normalize-space()='Fixed-Time Fixed-Cost Project']";
    public String FilterByProjectTypeOptionTimeAndMaterial = "xpath=//li[normalize-space()='Time & Material Project']";
    public String FilterByProjectTypeOptionTimeAndMaterialWithBudgetCap = "xpath=//li[normalize-space()='Time & Material with Budget Cap']";
    public String CheckResultsFilterByProjectTypeOptionFTFC = "xpath=//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[1]/p[1]";
    public String CheckResultsFilterByProjectTypeOptionTimeAndMaterial = "xpath= (//p[@class='MuiTypography-root MuiTypography-body1 css-yqx786'])[1]";
    public String CheckResultsFilterByProjectTypeOptionTimeAndMaterialWithBudgetCap = "xpath=(//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax'])[1]";

    //Filter by Project status
    public String btnFilterByProjectStatus = "xpath=//div[normalize-space()='Filter by Status']";
    public String FilterByProjectStatusOptionInitiating = "xpath=(//li[@role='option'])[1]";
    public String FilterByProjectStatusOptionHypercare = "xpath=(//li[@role='option'])[2]";
    public String FilterByProjectStatusOptionExecuting = "xpath=(//li[@role='option'])[3]";
    public String FilterByProjectStatusOptionCompleted = "xpath=(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters Mui-selected MuiMenuItem-root MuiMenuItem-gutters Mui-selected css-1iolbol'])[1]";
    public String FilterByProjectStatusOptionDiscontinued = "xpath=(//li[@class='MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters MuiMenuItem-root MuiMenuItem-gutters css-1iolbol'])[1]";
    public String CheckResultsFilterByStatusInitiating = "xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-63369s'])[1]";
    public String CheckResultsFilterByStatusExecuting = "xpath=(//p[contains(text(),'Executing')])[1]";
    public String CheckResultsFilterByStatusHypercare = "xpath=(//p[contains(text(),'Hypercare Support')])[1]";
    public String CheckResultsFilterByStatusCompleted = "xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-63369s'][normalize-space()='Completed'])[1]";
    public String CheckResultsFilterByStatusDiscontinued = "xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-63369s'][normalize-space()='Discontinued'])[1]";
    //project card content
    public String ProjectCardProjectName = "xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-138e72y'])[1]";
    public String ProjectCardCreatedOn = "xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-gdhd1b'])[1]";
    public String ProjectCardProjectStatus ="xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-63369s'])[1]";
    public String ProjectCardRemainingTime = "xpath=(//div[@class='MuiBox-root css-1byfef7'])[1]";
    public String ProjectCardProjectType = "xpath=(//p[@class='MuiTypography-root MuiTypography-body1 css-yqx786'])[1]";
    public String ProjectCardMemberIcons = "xpath=(//div[@class='MuiBox-root css-wo8od1'])[2]";

    //edit project member form components
    public String btnProjectMemberEdit = "xpath=//tbody/tr[2]/td[7]/div[1]/button[1]";
    public String formProjectMemberEdit = "xpath=(//div[@class='MuiBox-root css-1jp4s0u'])[1]";
    public String ProjectMemberEditName = "xpath=(//input[@id=':r21:'])[1]";
    public String ProjectMemberEditRole = "xpath=(//input[@id=':r22:'])[1]";
    public String ProjectMemberEditResourceStartDate = "xpath=(//input[@id=':r11:'])[1]";
    public String ProjectMemberEditResourceEndDate = "xpath=(//input[@id=':r26:'])[1]";
    public String ProjectMemberEditAllocation = "xpath=(//input[@id=':r29:'])[1]";

    public void CheckEditProjectMember(String resourceStart, String resourceEnd, String allocation){
        clickElement(btnProjectMemberEdit);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isElementVisible(formProjectMemberEdit);
        isElementVisible(ProjectMemberEditName);
        isElementVisible(ProjectMemberEditRole);
        typeText(ProjectMemberEditResourceStartDate, resourceStart);
//        typeText(ProjectMemberEditResourceEndDate, resourceEnd);
//        typeText(ProjectMemberEditAllocation, allocation);
    };

    public void CheckFilterProjectMemberByRole() {
        List<String> roles = List.of(
                FilterResultForRoleAIMLEngineer,
                FilterResultForRoleAccountManager,
                FilterResultForRoleBackendDeveloper,
                FilterResultForRoleBusinessAnalyst,
                FilterResultForRoleDevOps,
                FilterResultForFrontendDeveloper,
                FilterResultForFullStackDeveloper,
                FilterResultForMobileDeveloper,
                FilterResultForProjectManager,
                FilterResultForQAAutomation,
                FilterResultForQAManual,
                FilterResultForReviewerBackend,
                FilterResultForReviewerFrontend,
                FilterResultForReviewerMobile,
                FilterResultForScrumMaster,
                FilterResultForTechLead
        );

        for (int i = 0; i < roles.size(); i++) {
            clickElement(FilterByMemberRole);

            for (int j = 0; j < i; j++) {
                page.keyboard().press("ArrowDown");
            }

            page.keyboard().press("Enter");

            String result = roles.get(i);
            if (!isElementVisible(result)) {
                System.out.println("Role not visible: " + result);
            } else {
                System.out.println("Role verified: " + result);
            }
        }
    }


    public void CheckSearchProjectMember(String memberSearchInput){
        typeText(SearchProjectMember,memberSearchInput);
        isElementVisible(SearchProjectMemberResults);
        page.reload();
    }

    public void CheckProjectCardContent(){
        isElementVisible(ProjectCardProjectName);
        isElementVisible(ProjectCardCreatedOn);
        isElementVisible(ProjectCardProjectStatus);
        isElementVisible(ProjectCardRemainingTime);
        isElementVisible(ProjectCardMemberIcons);
        isElementVisible(ProjectCardProjectType);
        isElementVisible(btnEditProject);
    }

    public void  CheckFilterByProjectStatusInitiate(){
        clickElement(btnFilterByProjectStatus);
        clickElement(FilterByProjectStatusOptionHypercare);
        clickElement(FilterByProjectStatusOptionExecuting);
        isElementVisible(CheckResultsFilterByStatusInitiating);
        page.reload();
    }

    public void CheckFilterByProjectStatusExecuting(){
        clickElement(btnFilterByProjectStatus);
        clickElement(FilterByProjectStatusOptionInitiating);
        clickElement(FilterByProjectStatusOptionHypercare);
        isElementVisible(CheckResultsFilterByStatusExecuting);
        page.reload();
    }

    public void CheckFilterByProjectStatusHypercare(){
        clickElement(btnFilterByProjectStatus);
        clickElement(FilterByProjectStatusOptionInitiating);
        clickElement(FilterByProjectStatusOptionExecuting);
        isElementVisible(CheckResultsFilterByStatusHypercare);
        page.reload();
    }

    public void CheckFilterByProjectStatusCompleted(){
        clickElement(TabCompletedProjects);
        isElementVisible(CheckResultsFilterByStatusCompleted);
        page.reload();
    }

    public void CheckFilterByProjectStatusDiscontinued(){
        clickElement(TabCompletedProjects);
        clickElement(btnFilterByProjectStatus);
        clickElement(FilterByProjectStatusOptionCompleted);
        clickElement(FilterByProjectStatusOptionDiscontinued);
        isElementVisible(CheckResultsFilterByStatusDiscontinued);
    }

    public void CheckFilterByProjectTypeOptionFTFC(){
        clickElement(btnFilterByProjectType);
        clickElement(FilterByProjectTypeOptionTimeAndMaterial);
        clickElement(FilterByProjectTypeOptionTimeAndMaterialWithBudgetCap);
        isElementVisible(CheckResultsFilterByProjectTypeOptionFTFC);
        page.reload();
    }

    public void CheckFilterByProjectTypeOptionTimeAndMaterial(){
        clickElement(btnFilterByProjectType);
        clickElement(FilterByProjectTypeOptionFTFC);
        clickElement(FilterByProjectTypeOptionTimeAndMaterialWithBudgetCap);
        isElementVisible(CheckResultsFilterByProjectTypeOptionTimeAndMaterial);
        page.reload();
    }

    public void CheckFilterByProjectTypeOptionTimeAndMaterialWithBudgetCap(){
        clickElement(btnFilterByProjectType);
        clickElement(FilterByProjectTypeOptionFTFC);
        clickElement(FilterByProjectTypeOptionTimeAndMaterial);
        isElementVisible(CheckResultsFilterByProjectTypeOptionTimeAndMaterialWithBudgetCap);
        page.reload();
    }

    public void CheckActiveProjectTabSectionContent(){
        isElementVisible(btnCreateProject);
        isElementVisible(TabActiveProjects);
        isElementVisible(TabCompletedProjects);
        isElementVisible(SearchProject);
        isElementVisible(FilterByProjectType);
        isElementVisible(FilterByStatus);
    }

    public void CheckCompletedProjectTabSectionContent(){
        clickElement(TabActiveProjects);
        isElementVisible(btnCreateProject);
        isElementVisible(SearchProject);
        isElementVisible(FilterByProjectType);
        isElementVisible(FilterByStatus);
    }

    public void CheckProjectMainTabs(){
        isElementVisible(TabActiveProjects);
        isElementVisible(TabCompletedProjects);
    }

    public void ClickCreateProject(){
        clickElement(btnCreateProject);
    }

    public void CheckCreateProjectFormAvailability(){
        isElementVisible(formCreateProject);
    }

    public void CheckCreateProjectFormContent(){
        isElementVisible(InputFieldProjectName);
        isElementVisible(InputFieldClientName);
        isElementVisible(InputFieldProjectTypeFTFC);
        isElementVisible(InputFieldProjectTypeTM);
        isElementVisible(InputFieldProjectTypeTMCap);
        isElementVisible(InputFieldTentativeStart);
        isElementVisible(InputFieldTentativeEnd);
        isElementVisible(InputFieldHypercarePeriod);
        isElementVisible(InputFieldProjectManager);
        isElementVisible(btnNewProjectSave);
        isElementVisible(btnNewProjectCancel);
    }

    // Helper method to check if a field is mandatory
    public void checkIfMandatory(String inputFieldSelector, String fieldName) {
        boolean isRequired = page.locator(inputFieldSelector).getAttribute("required") != null;

        if (isRequired) {
            System.out.println(fieldName + " is a mandatory field.");
        } else {
            System.out.println(fieldName + " is not a mandatory field.");
        }
    }

    public void CheckCreateProjectFormMandatoryFields(){
        clickElement(btnCreateProject);
        checkIfMandatory(InputFieldProjectName, "Project Name");
        checkIfMandatory(InputFieldTentativeStart, "Tentative Start Date");
        checkIfMandatory(InputFieldTentativeEnd, "Tentative End Date");
        checkIfMandatory(InputFieldProjectManager, "Project Manager");

    }

    public void CreateProject(String projectName, String clientName, String TentativeStart, String TentativeEnd,String hypercarePeriod, String projectManager){
        //clickElement(btnCreateProject);
        typeText(InputFieldProjectName, projectName);
        typeText(InputFieldClientName,clientName);
        //clickElement(DropDownProjectType);
        //clickElement(InputFieldProjectTypeFTFC);
        typeText(InputFieldTentativeStart,TentativeStart);
        typeText(InputFieldTentativeEnd, TentativeEnd);
        typeText(InputFieldHypercarePeriod, hypercarePeriod);
        typeText(InputFieldProjectManager, projectManager);
        clickElement(btnNewProjectSave);
    }

    public void CheckSearchProject(){
        isElementVisible(SearchProject);
    }

    public void CheckSearchProjectResults(String searchItem){
        typeText(SearchProject,searchItem);
        isElementVisible(SearchProjectResults);
        clickElement(SearchProjectResults);
    }


    public void CheckEditProject(String projectName, String clientName, String TentativeStart, String TentativeEnd,String hypercarePeriod, String projectManager, String allocation){
        page.goBack();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickElement(btnEditProject);
        typeText(InputFieldEditProjectName, projectName);
        typeText(InputFieldEditClientName,clientName);
        clickElement(DropDownEditProjectType);

        page.keyboard().press("Enter");

        typeText(InputFieldEditTentativeStart,TentativeStart);
        typeText(InputFieldEditTentativeEnd, TentativeEnd);
        typeText(InputFieldEditHypercarePeriod, hypercarePeriod);
        typeText(InputFieldEditProjectManager, projectManager);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        typeText(InputFieldEditProjectAllocation, allocation);
        //clickElement(btnEditProjectSave);
    }
    public void CheckEditProjectFormMandatoryFields(){
        checkIfMandatory(InputFieldEditProjectName, "Edit project name");
        //checkIfMandatory(InputFieldEditClientName, "Edit client name");
        //checkIfMandatory(DropDownEditProjectType, "Edit project type");
        checkIfMandatory(InputFieldEditTentativeStart, "Edit Tentative start date");
        checkIfMandatory(InputFieldEditTentativeEnd, "Edit Tentative end date");
        checkIfMandatory(InputFieldEditHypercarePeriod, "Edit Hypercare period");
        checkIfMandatory(InputFieldEditProjectManager, "Edit project DR");
        checkIfMandatory(InputFieldEditProjectAllocation, "Edit Allocation");

        clickElement(btnEditProjectSave);
    }

    public void CheckAddProjectMember(String name, String role, String startDate, String endDate, String allocation) {
        clickElement(btnAddProjectMember);
        typeText(InputFieldAddMemberName, name);

        // Pause
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //clickElement(SelectFirstOptionInDropDown);

        page.keyboard().press("ArrowDown");
        page.keyboard().press("Enter");

        typeText(InputFieldAddMemberRole, role);
        typeText(InputFieldResourceStart, startDate);
        typeText(InputFieldResourceEnd, endDate);
        typeText(InputFieldAllocation, allocation);
    }

    public void CheckAddProjectMemberFormMandatoryFields(){
        clickElement(btnAddProjectMember);
        checkIfMandatory(InputFieldAddMemberName, "Add member name");
        checkIfMandatory(InputFieldAddMemberRole,"Add member role");
        checkIfMandatory(InputFieldResourceStart,"Resource start");
        checkIfMandatory(InputFieldResourceEnd,"Resource end");
        //checkIfMandatory(InputFieldAllocation,"Allocation");
        clickElement(btnAddMemberCancel);
    }

    public project(Page page) {
        super(page);
    }
}
