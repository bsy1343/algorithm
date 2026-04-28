# [Bronze I] Tomater - 26946

[문제 링크](https://www.acmicpc.net/problem/26946)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 89, 정답: 64, 맞힌 사람: 59, 정답 비율: 71.084%

### 분류

수학, 구현, 브루트포스 알고리즘, 시뮬레이션

### 문제 설명

<p>Ett intressant faktum &auml;r att omogna tomater mognar snabbare om man l&auml;gger in n&aring;gra redan mogna tomater bland dem. I denna uppgift ska du simulera denna process och r&auml;kna ut hur m&aring;nga tomater som &auml;r mogna efter en viss tid.</p>

<p>Antag att $n$ tomater ligger i en l&aring;ng rad och &auml;r numrerade fr&aring;n $1$ till $n$. Tre av dessa tomater, nummer $t_1$, $t_2$ och $t_3$, &auml;r redan mogna n&auml;r simuleringen startar vid dag $0$. Varje dag mognar de tomater som ligger precis intill en redan mogen tomat. Efter dag $1$ har allts&aring; grannarna till de tre f&ouml;rsta mogna tomaterna mognat, efter dag $2$ har &auml;ven grannarna till de som mognade under dag $1$ mognat och s&aring; vidare.</p>

<p>Skriv ett program som givet antal tomater $n$, antalet dagar $d$, och numren $t_1$, $t_2$, $t_3$, ber&auml;knar hur m&aring;nga tomater som &auml;r mogna efter $d$ dagar.</p>

### 입력

<p>P&aring; f&ouml;rsta raden av indata st&aring;r de tv&aring; talen $n$ ($3 \le n \le 100$) och $d$ ($1 \le d \le 100$).</p>

<p>P&aring; den andra raden st&aring;r numren $t_1$, $t_2$ och $t_3$, alla olika och i intervallet $1 \dots n$.</p>

### 출력

<p>Skriv ut ett enda tal: antalet mogna tomater efter $d$ dagar.</p>