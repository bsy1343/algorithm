# [Platinum I] Jalgpall - 7163

[문제 링크](https://www.acmicpc.net/problem/7163)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 3, 맞힌 사람: 3, 정답 비율: 27.273%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 이분 탐색, 누적 합, 값 / 좌표 압축, 역추적

### 문제 설명

<p>Bytelandis korraldatakse igal aastal &otilde;pilaste spordiv&otilde;istlusi. Eriti populaarne on jalgpall, mida m&auml;ngib $N$ &otilde;pilast, kusjuures &otilde;pilase $i$ tugevust jalgpallurina n&auml;itab t&auml;isarv $A_i$.</p>

<p>Turniiriks on vaja moodustada $K$ v&otilde;istkonda ja igas v&otilde;istkonnas peab olema v&auml;hemalt $M$ m&auml;ngijat. V&otilde;istkonna tugevus on selle liikmete tugevuste aritmeetiline keskmine. N&auml;iteks kui v&otilde;istkonnas on m&auml;ngijad tugevustega $1$, $5$, $4$ ja $9$, siis selle v&otilde;istkonna tugevus on $\frac{1+5+4+9}{4} = 4{,}75$.</p>

<p>Treener kirjutas k&otilde;igi m&auml;ngijate tugevused paberile &uuml;hte ritta. N&uuml;&uuml;d tahab ta jagada selle rea $K$ l&otilde;iguks, kus igas l&otilde;igus on v&auml;hemalt $M$ arvu. Siis moodustab ta igasse l&otilde;iku j&auml;&auml;vatest m&auml;ngijatest &uuml;he v&otilde;istkonna. Selleks, et turniir oleks p&otilde;nevam, tahab treener, et n&otilde;rgima v&otilde;istkonna tugevus oleks maksimaalne v&otilde;imalik.</p>

<p>N&auml;iteks kui m&auml;ngijate tugevused on $5$, $4$, $4$, $3$, $5$, $1$ ja $8$ ning vaja on moodustada kaks v&otilde;istkonda, milles kummaski on v&auml;hemalt kolm m&auml;ngijat, on treeneril kaks v&otilde;imalust:</p>

<ul>
	<li>panna esimesse v&otilde;istkonda m&auml;ngijad tugevustega $5$, $4$ ja $4$ ning teise v&otilde;istkonda m&auml;ngijad tugevustega $3$, $5$, $1$ ja $8$;</li>
	<li>panna esimesse v&otilde;istkonda m&auml;ngijad tugevustega $5$, $4$, $4$ ja $3$ ning teise v&otilde;istkonda m&auml;ngijad tugevustega $5$, $1$ ja $8$.</li>
</ul>

<p>Esimesel juhul oleks n&otilde;rgema v&otilde;istkonna tugevus $4{,}25$, teisel juhul $4$. Seega valib treener esimese variandi.</p>

<p>Kirjutada programm, mis leiab antud m&auml;ngijate n&otilde;utud jaotuse v&otilde;istkondadeks.</p>

### 입력

<p>Tekstifaili esimesel real on t&uuml;hikutega eraldatud t&auml;isarvud $N$, $M$ ja $K$ ($6 \le N \le 10^4$, $2 \le M$, $2 \le K \le 500$, $K \cdot M \le N$), vastavalt m&auml;ngijate arv, v&otilde;istkonna minimaalne n&otilde;utud suurus ja vajalike v&otilde;istkondade arv.</p>

<p>Faili teisel real on $N$ t&uuml;hikuga eraldatud t&auml;isarvu $A_i$ ($1 \le A_i \le 10^9$), m&auml;ngijate tugevused.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada t&auml;pselt $K$ t&uuml;hikutega eraldatud t&auml;isarvu $B_i$, mis n&auml;itavad, et esimese v&otilde;istkonna moodustavad $B_1$ esimest m&auml;ngijat, teise v&otilde;istkonna $B_2$ j&auml;rgmist j.n.e.</p>