# [Platinum II] Sarnased hulknurgad - 7129

[문제 링크](https://www.acmicpc.net/problem/7129)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 1, 맞힌 사람: 1, 정답 비율: 12.500%

### 분류

문자열, 기하학, 많은 조건 분기, KMP

### 문제 설명

<p>Juku &otilde;pib koolis hulknurkade sarnasust ja saab teada, et hulknurgad on sarnased, kui nende vastavate nurkade suurused on v&otilde;rdsed ja vastavate k&uuml;lgede pikkused v&otilde;rdelised. Sarnased hulknurgad v&otilde;ivad olla omavahel p&ouml;&ouml;ratud, peegeldatud ja nihutatud. Sarnaste hulknurkade vastavate k&uuml;lgede pikkuste jagatist nimetatakse nende sarnasusteguriks.</p>

<p>Kodut&ouml;&ouml;na saab ta hulga hulknurki, mille sarnasustegureid on vaja m&auml;&auml;rata. Jukul on fanaatiline matemaatika&otilde;petaja, kes andis t&ouml;&ouml;na v&auml;ga paljude nurkadega hulknurki. Aita ta h&auml;dast v&auml;lja. </p>

### 입력

<p>Tekstifaili esimesel real on hulknurga tippude arv $N$ ($3 \le N \le 200\,000$). Faili teisel real on $2 \cdot N$ t&auml;isarvu l&otilde;igust $-10^9$ kuni $10^9$: esimese hulknurga tippude x- ja y-koordinaadid. Kolmandal real on samuti $2 \cdot N$ arvu: teise hulknurga tippude koordinaadid. Tipud v&otilde;ivad olla antud nii p&auml;rip&auml;eva kui vastup&auml;eva j&auml;rjekorras. Antud punktid moodustavad alati hulknurga, milles pole &uuml;htelangevaid punkte, sirgnurki, ega endaga l&otilde;ikumisi.</p>

### 출력

<p>Kui hulknurgad on sarnased, siis kirjutada tekstifaili esimesele reale t&auml;pselt &uuml;ks reaalarv (t&auml;psusega v&auml;hemalt $0{,}0001$), mis n&auml;itab, mitu korda on esimene hulknurk suurem kui teine (kui esimene hulknurk on v&auml;iksem, on ka vastus v&auml;iksem kui $1$). Faili teisele reale kirjutada t&auml;isarv, mis n&auml;itab, mitmes teise hulknurga tipp vastab esimese hulknurga esimesele tipule (m&otilde;lema hulknurga tipud on nummerdatud alates &uuml;hest nende failis esitamise j&auml;rjekorras). Kui hulknurgad ei ole sarnased, kirjutada v&auml;ljundfaili ainsale reale $-1$.</p>