# [Gold II] Räkneuttrycket - 26897

[문제 링크](https://www.acmicpc.net/problem/26897)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>Hedvig har f&aring;tt i l&auml;xa att evaluera ett l&aring;ngt r&auml;kneuttryck. Det best&aring;r av icke-negativa heltal &aring;tskilda med operatorerna +, - och * (plus, minus och g&aring;nger). Hon beh&ouml;ver dock inte anv&auml;nda sig av de g&auml;ngse prioritetsreglerna, utan hon kan fritt v&auml;lja tv&aring; n&auml;rliggande tal med en operator emellan, evaluera detta uttryck och ers&auml;tta uttrycket med resultatet av operationen. Proceduren upprepas tills endast ett tal &aring;terst&aring;r: resultatet av evalueringen av hela uttrycket.</p>

<p>Skriv ett program som ber&auml;knar det st&ouml;rsta m&ouml;jliga resultatet Hedvig kan f&aring;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26897.%E2%80%85R%C3%A4kneuttrycket/d72081c9.png" data-original-src="https://upload.acmicpc.net/95491def-c7fb-477e-b8f7-07cd3496d321/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 277px; height: 300px;" /></p>

<p style="text-align: center;">En optimal evalueringsordning i andra exemplet.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r en str&auml;ng med max 100 tecken: uttrycket som ska evalueras. Det f&ouml;ljer m&ouml;nstret \newline [tal] [operator] [tal] [operator]....[operator] [tal] utan n&aring;gra blanksteg. Varje operator &auml;r antingen +, - eller *, och varje ing&aring;ende tal $k_i$ uppfyller $0\leq k_i &lt; 1000000$. Inget tal skrivs med &ouml;verfl&ouml;diga inledande nollor.</p>

### 출력

<p>Ett heltal: det st&ouml;rsta v&auml;rdet som kan erh&aring;llas genom att evaluera uttrycket i valfri ordning. Detta tal, liksom alla m&ouml;jliga delresultat som kan uppkomma, &auml;r alltid st&ouml;rre &auml;n $-10^{18}$ och mindre &auml;n $10^{18}$.</p>