# [Silver III] Gourmeten - 26936

[문제 링크](https://www.acmicpc.net/problem/26936)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 22, 맞힌 사람: 20, 정답 비율: 90.909%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Den franska gourmeten Frank &auml;r en v&auml;l respekterad gourmet; hans yrke &auml;r att g&aring; runt till olika restauranger, &auml;ta av deras mat och ge sitt omd&ouml;me om restaurangen. Men han b&auml;r p&aring; en hemlighet: han &auml;r egentligen bara intresserad av att &auml;ta s&aring; mycket som m&ouml;jligt och i vilken ordning som helst!</p>

<p>Frank f&ouml;rst&aring;r dock att en &auml;kta gourmet inte kan &auml;ta hur som helst, t.ex. b&ouml;rja med sin dessert och avsluta med en sallad. D&auml;rf&ouml;r ber han om din hj&auml;lp att ta fram en lista med alla olika s&auml;tt att ordna matr&auml;tterna under en bjudning, s&aring; han kan v&auml;lja ut den ordning som &auml;r finast.</p>

<p>P&aring; bjudningen har Frank $M$ minuter p&aring; sig att &auml;ta. Restaurangen bjuder p&aring; $N$ olika r&auml;tter som han kan &auml;ta hur m&aring;nga portioner som helst av. Varje r&auml;tt $i$ tar ett visst givet antal minuter $T_i$ att &auml;ta. Frank vill &auml;ta kontinuerligt under alla de $M$ minuter han har p&aring; sig, och han vill hinna &auml;ta klart alla r&auml;tter han p&aring;b&ouml;rjat. Han vill aldrig p&aring;b&ouml;rja en ny r&auml;tt innan han &auml;tit f&auml;rdigt den f&ouml;rra. Din uppgift &auml;r att skriva ett program som r&auml;knar ut p&aring; hur m&aring;nga olika s&auml;tt han kan l&auml;gga upp middagen, givet dessa restriktioner.</p>

### 입력

<p>P&aring; f&ouml;rsta raden st&aring;r ett heltal $M$, antalet minuter, d&auml;r $1 \le M \le 1,000$.</p>

<p>P&aring; andra raden st&aring;r ett heltal $N$, antalet r&auml;tter, d&auml;r $1 \le N \le 30$.</p>

<p>D&auml;refter f&ouml;ljer $N$ rader med ett heltal $T_i$ p&aring; varje rad, tiden det tar att &auml;ta varje r&auml;tt, d&auml;r $1 \le T_i \le 200$.</p>

### 출력

<p>Programmet ska skriva ut antalet m&ouml;jliga s&auml;tt Frank kan &auml;ta under exakt $M$ minuter. Svaret kommer alltid understiga $2$ miljarder.</p>

### 힌트

<p>Frank ska allts&aring; &auml;ta under $10$ minuter och han har $2$ r&auml;tter att v&auml;lja p&aring;, t.ex. sallad (tar $3$ minuter att &auml;ta), och paj ($7$ minuter). Det finns bara tv&aring; s&auml;tt att &auml;ta p&aring;: f&ouml;rst paj sen sallad eller tv&auml;rtom. &Auml;ter han bara sallad kommer han antingen att bli klar f&ouml;r snabbt ($3 \text{ portioner} = 9 \text{ minuter}$) eller f&ouml;r sent ($4 \text{ portioner} = 12 \text{ minuter}$).</p>