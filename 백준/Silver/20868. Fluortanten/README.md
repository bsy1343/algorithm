# [Silver IV] Fluortanten - 20868

[문제 링크](https://www.acmicpc.net/problem/20868)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 90, 정답: 68, 맞힌 사람: 31, 정답 비율: 72.093%

### 분류

구현, 누적 합

### 문제 설명

<p>Bj&ouml;rn och $n-1$ andra personer st&aring;r i k&ouml;n f&ouml;r att tr&auml;ffa fluortanten. Olika personer tycker att det &auml;r olika l&auml;skigt att tr&auml;ffa fluortanten. Personerna &auml;r numrerade fr&aring;n $1$ till $n$, och person $i$ st&aring;r p&aring; plats $i$ i k&ouml;n. Person $i$ har ocks&aring; ett v&auml;rde $a_i$, som visar hur og&auml;rna personen vill tr&auml;ffa fluortanten. Person $i$:s gl&auml;dje &ouml;ver sin plats i k&ouml;n &auml;r $i \cdot a_i$. Vissa personer kan ha negativ $a_i$, vilket betyder att de egentligen vill tr&auml;ffa fluortanten och s&aring;lunda &auml;r ledsna &ouml;ver att f&aring; v&auml;nta.</p>

<p>Bj&ouml;rn &auml;r den enda personen som &auml;r helt likgiltig inf&ouml;r att tr&auml;ffa fluortanten, det vill s&auml;ga han &auml;r den enda personen som har $a_i = 0$. Dessutom &auml;r han v&auml;ldigt godhj&auml;rtad, s&aring; han best&auml;mmer sig f&ouml;r att l&auml;mna k&ouml;n och sedan g&aring; in i k&ouml;n igen p&aring; n&aring;gon plats s&aring; att den totala gl&auml;djen hos alla i k&ouml;n blir s&aring; stor som m&ouml;jligt. Skriv ett program som givet v&auml;rdena $a_i$ f&ouml;r alla personer r&auml;knar ut den maximala summan av gl&auml;djen i k&ouml;n om Bj&ouml;rn st&auml;ller sig p&aring; en optimal plats.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller ett heltal $n$, antalet personer i k&ouml;n. P&aring; n&auml;sta rad f&ouml;ljer $n$ heltal, d&auml;r det $i$:te talet &auml;r $a_i$. $1 \leq n \leq 10^6$, $-1000 \leq a_i \leq 1000$.</p>

### 출력

<p>Skriv ut en rad med ett heltal: den maximala totala gl&auml;djen i k&ouml;n.</p>