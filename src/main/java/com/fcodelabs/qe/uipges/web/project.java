package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

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
    //project card content

    //project details components
    public String SearchProjectMember = "xpath=//input[@id='search-bar']";
    public String btnAddProjectMember = "xpath=//p[normalize-space()='+ Add Member']";
    //Add member form components
    public String InputFieldAddMemberName = "xpath=//input[@id=':rc:']";
    public String SelectFirstOptionInDropDown = "xpath=div[class='MuiBox-root css-18mgonu'] div:nth-child(3)";
    public String InputFieldAddMemberRole = "xpath=//input[@id=':re:']";
    public String InputFieldResourceStart = "xpath=//input[@id=':rg:']";
    public String InputFieldResourceEnd = "xpath=//input[@id=':ri:']";
    public String InputFieldAllocation = "xpath=//input[@id=':ro:']";
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

    public void CheckAddProjectMemberFormMandatoryFields(){
        checkIfMandatory(InputFieldAddMemberName, "Add member name");
        checkIfMandatory(InputFieldAddMemberRole,"Add member role");
        checkIfMandatory(InputFieldResourceStart,"Resource start");
        checkIfMandatory(InputFieldResourceEnd,"Resource end");
        checkIfMandatory(InputFieldAllocation,"Allocation");
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
        clickElement(btnEditProjectSave);
    }

    public void CheckAddProjectMember(String name, String role, String startDate, String endDate, String allocation) {
        clickElement(btnAddProjectMember);

        // Pause for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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

        clickElement(btnAddMemberSave);
    }





    public project(Page page) {
        super(page);
    }
}
