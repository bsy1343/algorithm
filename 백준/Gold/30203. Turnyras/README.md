# [Gold IV] Turnyras - 30203

[문제 링크](https://www.acmicpc.net/problem/30203)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

구현, 정렬

### 문제 설명

<p>n žaidėjų (kur n yra dvejeto laipsnis) žais atkrentamajame turnyre. Kiekvienas žaidėjas gavo po skirtingą numerį 1 &le; i &le; n.</p>

<p>Atkrentamojo turnyro tvarkara&scaron;tis sudaromas tokiu būdu. Po vieną traukiami žaidėjų numeriai, i-asis i&scaron;trauktas numeris žymimas a<sub>i</sub>. Pirmame etape a<sub>1</sub>-asis turės žaisti su a<sub>2</sub>-uoju, a<sub>3</sub>-iasis su a<sub>4</sub>-uoju ir t.t., kol liks n/2 laimėtojų, kurie antrame etape paeiliui ketina žaisti 1-asis laimėtojas su 2-uoju, 3-iasis su 4-uoju ir t.t., kol liks n/4 laimėtojų ir t.t., kol liks vienas turnyro nugalėtojas.</p>

<p>Paai&scaron;kėjo, kad kai kuriems žaidėjams netinka kai kurie turnyro laikai, ir jie pasiūlė jiems tinkamas žaidimo sekas, t.y. seką A = (a<sub>1</sub>, ..., a<sub>n</sub>) pakeisti seka B<sub>j</sub>. Bet likę žaidėjai nori, kad turnyro seka liktų identi&scaron;ka pradinei, t. y. kad kiekviena žaidėjų pora turėtų galimybę (jei abu laimės iki tol) sužaisti tame pačiame etape.</p>

<p>Para&scaron;ykite programą, kuri pagal duotą seką A nustatytų, ar turnyrai A ir B<sub>j</sub> yra identi&scaron;ki.</p>

### 입력

<p>Pirmoje eilutėje pateikti du skaičiai n ir k &ndash; žaidėjų ir siūlomų sekų skaičiai.</p>

<p>Antroje pateikta seka A, kurios i-asis skaičius yra a<sub>i</sub> (1 &le; i &le; n).</p>

<p>Tolimesnėse k eilučių apra&scaron;ytos sekos B<sub>j</sub> (1 &le; j &le; k): j + 2-ojoje eilutėje pateikta seka B<sub>j</sub>, kurios i-uoju skaičiumi b<sub>j,i</sub> norima pakeisti skaičių a<sub>i</sub> (1 &le; i &le; n).</p>

### 출력

<p>I&scaron;veskite k eilučių, kuriose būtų po vieną žodį &ndash; <code>TAIP</code> arba <code>NE</code>, nusakantį, ar turnyro seka B<sub>j</sub> yra identi&scaron;ka sekai A.</p>

### 제한

<ul>
	<li>4 &le; n &le; 2<sup>16</sup></li>
	<li>n yra dvejeto laipsnis</li>
	<li>1 &le; k &le; 20</li>
	<li>1 &le; a<sub>i</sub>, b<sub>j,i</sub> &le; n</li>
	<li>a<sub>u</sub> &ne; a<sub>v</sub> ir b<sub>j,u</sub> &ne; b<sub>j,v</sub> kai u &ne; v</li>
</ul>