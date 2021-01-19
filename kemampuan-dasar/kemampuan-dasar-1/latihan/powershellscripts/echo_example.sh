Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Try the new cross-platform PowerShell https://aka.ms/pscore6

PS C:\Users\TAUFIQ DWI CAHYONO> Write-Output 'Custom PowerShell profile in effect!'
Custom PowerShell profile in effect!
PS C:\Users\TAUFIQ DWI CAHYONO> Add-Content -Path 'D:\Script Lab\MyScript.ps1' -Value "[ZoneTransfer]`nZoneId=3" -Stream 'Zone.Identifier'
Add-Content : Could not open the alternate data stream 'Zone.Identifier' of the file '
D:\Script Lab\MyScript.ps1'.
At line:1 char:1
+ Add-Content -Path 'D:\Script Lab\MyScript.ps1' -Value "[ZoneTransfer] ...
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (D:\Script Lab\MyScript.ps1:String) [Ad
   d-Content], FileNotFoundException
    + FullyQualifiedErrorId : GetContentWriterFileNotFoundError,Microsoft.PowerShell.
   Commands.AddContentCommand

PS C:\Users\TAUFIQ DWI CAHYONO> Add-Content -Path 'D:\MyScript.ps1' -Value "[ZoneTransfer]`nZoneId=3" -Stream 'Zone.Identifier'
PS C:\Users\TAUFIQ DWI CAHYONO>
PS C:\Users\TAUFIQ DWI CAHYONO> Write-Output 'Custom PowerShell profile in effect!'
Custom PowerShell profile in effect!
PS C:\Users\TAUFIQ DWI CAHYONO> Add-Content -Path 'D:\MyScript.ps1' -Value "[ZoneTransfer]`nZoneId=3" -Stream 'Zone.Identifier'
PS C:\Users\TAUFIQ DWI CAHYONO>
PS C:\Users\TAUFIQ DWI CAHYONO>
PS C:\Users\TAUFIQ DWI CAHYONO> PowerShell.exe -ExecutionPolicy Bypass -Command "& '%~dpn0.ps1'"
& : The term '%~dpn0.ps1' is not recognized as the name of a cmdlet, function, script
file, or operable program. Check the spelling of the name, or if a path was included,
verify that the path is correct and try again.
At line:1 char:3
+ & '%~dpn0.ps1'
+   ~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (%~dpn0.ps1:String) [], CommandNotFound
   Exception
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\TAUFIQ DWI CAHYONO> Add-Content -Path 'D:\MyScript.ps1' -Value "[ZoneTransfer]`nZoneId=3" -Stream 'Zone.Identifier'
PS C:\Users\TAUFIQ DWI CAHYONO> Clear-Content -Path 'D:\MyScript.ps1' -Stream 'Zone.Identifier'
PS C:\Users\TAUFIQ DWI CAHYONO> PowerShell.exe -ExecutionPolicy Bypass -Command "& '%~dpn0.ps1'"
& : The term '%~dpn0.ps1' is not recognized as the name of a cmdlet, function, script
file, or operable program. Check the spelling of the name, or if a path was included,
verify that the path is correct and try again.
At line:1 char:3
+ & '%~dpn0.ps1'
+   ~~~~~~~~~~~~
    + CategoryInfo          : ObjectNotFound: (%~dpn0.ps1:String) [], CommandNotFound
   Exception
    + FullyQualifiedErrorId : CommandNotFoundException

PS C:\Users\TAUFIQ DWI CAHYONO> if (([Security.Principal.WindowsPrincipal][Security.Principal.WindowsIdentity]::GetCurrent()).IsInRole([Security.Principal.WindowsBuiltInRole] "Administrator"))
>> {Write-Output 'Running as Administrator!'}
>> else
>> {Write-Output 'Running Limited!'}
>> Pause
Running Limited!
Press Enter to continue...:
PS C:\Users\TAUFIQ DWI CAHYONO> PowerShell.exe -Command "& {Start-Process PowerShell.exe -ArgumentList '-ExecutionPolicy Bypass -File ""%~dpn0.ps1""' -Verb RunAs}"
Start-Process : This command cannot be run due to the error: The operation was cancele
d by the user.
At line:1 char:4
+ & {Start-Process PowerShell.exe -ArgumentList '-ExecutionPolicy Bypas ...
+    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : InvalidOperation: (:) [Start-Process], InvalidOperation
   Exception
    + FullyQualifiedErrorId : InvalidOperationException,Microsoft.PowerShell.Commands
   .StartProcessCommand

PS C:\Users\TAUFIQ DWI CAHYONO> PowerShell.exe -Command "& {Start-Process PowerShell.exe -ArgumentList '-ExecutionPolicy Bypass -File ""%~dpn0.ps1""' -Verb RunAs}"
PS C:\Users\TAUFIQ DWI CAHYONO> PowerShell.exe -NoProfile -Command "& {Start-Process PowerShell.exe -ArgumentList '-NoProfile -ExecutionPolicy Bypass -File ""%~dpn0.ps1""' -Verb RunAs}"
PS C:\Users\TAUFIQ DWI CAHYONO>