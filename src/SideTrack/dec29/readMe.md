what prob does CI/CD solves ?
Automation,faster release, less manual work, early bug detection.

Cron job



Github push ----> Maven build -------> Sonarqube test -------> deploy to dev ----> deploy to QA --> deploy to prod


create a profile -> issue reported by user -> raise a tkt ->  bug -> recreate the issue in local -> fix the bug and then in
next release promtoe the change to fix the bug.

weekly/montly/quartely

release 3.53v -> whole app is broken   -> 3.52 v
RF -> roll forward , RB -> roll backward  -> previous prod release label 3.52
CHG request  -> label    25-bdshdbewh-c4545

RM -> release management
PS -> production support
devops 

Hotfix -> bug -> CHG request with senior mgmt permission
db db query to update 

push ---> dev ---- qa1----qa2 ----staging----pre prod ---CHG req---prod ---- cob 


3.52 v in prod which has a bug -> prod
3.53 v bug was fixed - QA trying to reproduce 





