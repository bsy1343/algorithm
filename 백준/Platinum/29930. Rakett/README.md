# [Platinum I] Rakett - 29930

[문제 링크](https://www.acmicpc.net/problem/29930)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 자료 구조, 그리디 알고리즘, 세그먼트 트리, 분할 정복, 값 / 좌표 압축, 분할 정복을 사용한 최적화

### 문제 설명

<p>Marslased ehitavad uut kosmoseraketti. See koosneb $N$ <em>moodulist</em>, mis on liinil reas ja nummerdatud j&auml;rjest $1 \ldots N$. Moodulisse number $i$ mahub $A_i$ liitrit k&uuml;tust, kusjuures moodulite mahutavused on paarikaupa erinevad.</p>

<p>N&uuml;&uuml;d tuleb moodulitest koostada $K$ <em>astet</em>, millest iga&uuml;ks koosneb &uuml;hest v&otilde;i mitmest j&auml;rjestikusest moodulist nii, et iga moodul kuulub t&auml;pselt &uuml;he astme koosseisu. Teisis&otilde;nu on vaja moodulite massiiv $A$ jagada $K$ mittet&uuml;hjaks l&otilde;iguks.</p>

<p>Viimasel hetkel avastati, et rakett lendab k&otilde;ige kiiremini, kui moodulid on igas astmes j&auml;rjestatud mahtude kasvamise j&auml;rjekorras. Moodulid on suured ja rasked ning seet&otilde;ttu kulub kahe k&otilde;rvuti\-oleva mooduli omavahel vahetamiseks terve tund ja &uuml;ksteisest kaugemaid mooduleid omavahel vahetada ei saagi.</p>

<p>Kirjutada programm, mis leiab minimaalse vahetuste arvu, mille j&auml;rel on v&otilde;imalik moodulid jagada $K$ astmeks nii, et igas astmes on moodulid kasvavas j&auml;rjekorras.</p>

### 입력

<p>Tekstifaili esimesel real on t&uuml;hikuga eraldatud t&auml;isarvud $N$ ja $K$ ($1 \le K \le N \le 2\,000$): vastavalt moodulite ja raketi astmete arv.</p>

<p>Faili teisel real on $N$ t&uuml;hikutega eraldatud t&auml;isarvu $A_i$ ($1 \le A_i \le 10^9$): moodulite mahutavused nende numbrite j&auml;rjekorras. V&otilde;ib eedada, et arvud $A_i$ on paarikaupa erinevad.</p>

### 출력

<p>Tekstifaili v&auml;ljastada &uuml;ks t&auml;isarv: minimaalne moodulite &uuml;mberj&auml;rjestamiseks kuluv aeg.</p>