# [Gold IV] Ståskrivbordet - 26903

[문제 링크](https://www.acmicpc.net/problem/26903)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 9, 맞힌 사람: 9, 정답 비율: 60.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Annas mamma klagar att hon <em>sitter</em> f&ouml;r mycket vid datorn varje dag. N&auml; detta ska Anna minsann ordna. Hon har best&auml;mt sig f&ouml;r att <em>st&aring;</em> upp vid datorn ist&auml;llet!</p>

<p>Men datorsk&auml;rmen st&aring;r f&ouml;r h&ouml;gt upp! Anna beh&ouml;ver komma upp exakt $x$ centimeter av ergonomiska sk&auml;l. Hon har $n$ plattor till sin hj&auml;lp. Genom att l&auml;gga ett antal av dem under vardera foten, s&aring; kan hon komma upp exakt $x$ centimeter. Plattorna under h&ouml;ger fot m&aring;ste allts&aring; ha sammanlagd h&ouml;jd $x$ centimeter, och plattorna under v&auml;nster fot m&aring;ste ocks&aring; ha sammanlagd h&ouml;jd $x$ centimeter. Vad &auml;r det minsta totala antalet plattor hon beh&ouml;ver?</p>

### 입력

<p>F&ouml;rst kommer en rad med talen $x$ och $n$ ($10 \leq x \leq 100$, $2 \leq n \leq 20$), hur m&aring;nga centimeter Anna m&aring;ste l&auml;gga under varje fot respektive antalet plattor.</p>

<p>D&auml;refter kommer en rad med $n$ heltal $h_i$ ($1 \leq h_i \leq 100$). Det kommer alltid att finnas en l&ouml;sning.</p>

### 출력

<p>F&ouml;r att g&ouml;ra det sv&aring;rare att gissa r&auml;tt svar, s&aring; ska du skriva ut tv&aring; heltal $n_1$ och $n_2$, antalet plattor hon har under vardera fot. Skriv det minsta talet f&ouml;rst, d.v.s. se till att $n_1\leq n_2$. Om det finns flera l&ouml;sningar d&auml;r totala antalet plattor &auml;r samma s&aring; kan du v&auml;lja vilken som helst utav dem.</p>