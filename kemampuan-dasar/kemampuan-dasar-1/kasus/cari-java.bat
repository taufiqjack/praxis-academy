Get-ChildItem -Path.\ -Filter *.java -Recurse -File | Sort-Object
Length -Descending | ForEach-Object{
$_.FullName.Remove($_.FullName.Length - $_.Extension.Length)
} | clip