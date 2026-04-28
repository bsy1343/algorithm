# [Bronze I] Sarnased kolmnurgad - 7124

[문제 링크](https://www.acmicpc.net/problem/7124)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 74, 정답: 48, 맞힌 사람: 37, 정답 비율: 59.677%

### 분류

기하학, 피타고라스 정리

### 문제 설명

<p>Juku &otilde;pib koolis kolmnurkade sarnasust ja saab teada, et kolmnurgad on sarnased, kui nende vastavate nurkade suurused on v&otilde;rdsed ja vastavate k&uuml;lgede pikkused v&otilde;rdelised. Sarnased kolmnurgad v&otilde;ivad olla omavahel p&ouml;&ouml;ratud, peegeldatud ja nihutatud. Sarnaste kolmnurkade vastavate k&uuml;lgede pikkuste jagatist nimetatakse nende sarnasusteguriks.</p>

<p>Kodut&ouml;&ouml;na saab ta hulga kolmnurki, mille sarnasustegureid on vaja m&auml;&auml;rata. Kuna 21. sajandil sobivad arvutamiseks rohkem arvutid kui inimesed, aita Jukul kirjutada programm, mis selle t&ouml;&ouml; tema eest &auml;ra teeb.</p>

### 입력

<p>Tekstifaili esimesel real on kuus t&auml;isarvu l&otilde;igust $-10^9$ kuni $10^9$: esimese kolmnurga tippude x- ja y-koordinaadid. Teisel real on samuti kuus arvu: teise kolmnurga tippude koordinaadid. Tipud v&otilde;ivad olla antud nii p&auml;rip&auml;eva kui vastup&auml;eva j&auml;rjekorras. Antud punktid moodustavad alati kolmnurga (pole &uuml;htelangevaid punkte ega sirgnurki).</p>

### 출력

<p>Kui kolmnurgad on sarnased, siis kirjutada tekstifaili t&auml;pselt &uuml;ks reaalarv (t&auml;psusega v&auml;hemalt $0{,}0001$), mis n&auml;itab, mitu korda on esimene kolmnurk suurem kui teine (kui esimene kolmnurk on v&auml;iksem, on ka vastus v&auml;iksem kui $1$). Kui kolmnurgad ei ole sarnased, kirjutada v&auml;ljundfaili $-1$.</p>