# [Bronze II] Turnering - 26943

[문제 링크](https://www.acmicpc.net/problem/26943)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 99, 정답: 72, 맞힌 사람: 63, 정답 비율: 74.118%

### 분류

구현, 시뮬레이션

### 문제 설명

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6bb1553b-b271-4e14-86f7-3013477fe85b/-/preview/" /></p>

<p>Om man vill ordna t.ex. en bordshockeyturnering d&auml;r alla m&ouml;ter alla kan man anv&auml;nda sig av ett praktiskt rotationsschema som kallas round robin. Det g&aring;r till s&aring; att spelarna i den f&ouml;rsta omg&aring;ngen m&ouml;ter varandra enligt figuren ovan (vi antar att antalet spelare $n$ &auml;r j&auml;mnt). N&auml;r f&ouml;rsta omg&aring;ngen &auml;r klar f&ouml;rflyttar sig alla spelare ett steg medurs, utom spelaren i det nedre v&auml;nstra h&ouml;rnet som hoppas &ouml;ver (d&auml;rav namnet, man f&ouml;rflyttar sig &quot;runt&quot; Robin, d.v.s. den sista spelaren). Med detta rotationsschema &auml;r man garanterad att alla har m&ouml;tt alla precis en g&aring;ng efter $n-1$ omg&aring;ngar.</p>

<p>Din uppgift &auml;r att skriva ett program som skriver ut vilka spelare som ska m&ouml;ta vilka en viss omg&aring;ng.</p>

### 입력

<p>Indata best&aring;r av tv&aring; heltal: antal spelare i turneringen (ett j&auml;mnt tal $n$ mellan $2$ och $100$) och omg&aring;ngen (mellan $1$ och $n-1$).</p>

### 출력

<p>Programmet ska skriva ut $n/2$ rader som beskriver vilka som m&ouml;ter vilka, d&auml;r varje rad &auml;r p&aring; formatet <code>a-b</code>. Ordningen p&aring; matcherna spelar ingen roll.</p>