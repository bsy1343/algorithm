# [Gold IV] Matbeställning - 20844

[문제 링크](https://www.acmicpc.net/problem/20844)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Anthony och hans $n$ v&auml;nner &auml;r p&aring; restaurang och ska best&auml;lla mat. Menyn har $m$ r&auml;tter, och alla v&auml;nnerna har fr&aring;n b&ouml;rjan valt r&auml;tter som de vill ha. Anthony blir dock gladare ju fler olika r&auml;tter s&auml;llskapet best&auml;ller, s&aring; att han f&aring;r se mer av vad restaurangen har att erbjuda. Han kan till och med t&auml;nka sig att betala f&ouml;r v&auml;nnernas mat f&ouml;r att h&ouml;ja antalet olika best&auml;llda r&auml;tter.</p>

<p>Idag vill Anthony att v&auml;nnerna ska best&auml;lla minst $k$ olika r&auml;tter. Han kan f&aring; en v&auml;n att byta best&auml;llning till en dyrare r&auml;tt genom att betala mellanskillnaden mellan kostnaden f&ouml;r v&auml;nnens ursprungliga val och den dyrare r&auml;tten (men varje person best&auml;ller fortfarande bara en sak). Han kan g&ouml;ra s&aring; m&aring;nga s&aring;dana byten som han vill.</p>

<p>Givet antalet r&auml;tter, deras kostnader, och v&auml;nnernas ursprungliga best&auml;llningar, vad &auml;r det minsta Anthony beh&ouml;ver betala f&ouml;r att kunna se till att v&auml;nnerna best&auml;ller minst $k$ olika r&auml;tter?</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tre heltal $n$, $m$ och $k$, antalet v&auml;nner, antalet r&auml;tter och det &ouml;nskade antalet unika best&auml;llningar ($1 \leq n, m \leq 2 \cdot 10^5$, $1 \le k \le n$). \\ D&auml;refter kommer en rad med $n$ heltal $x_1 \dots x_n$, d&auml;r $x_i$ ($1 \leq x_i \leq m$) &auml;r den r&auml;tt som v&auml;n $i$ fr&aring;n b&ouml;rjan vill k&ouml;pa. \\ D&auml;refter kommer en rad med $m$ heltal $c_1 \dots c_m$, d&auml;r $c_i$ ($1 \leq c_i \leq 10^9$) &auml;r kostnaden f&ouml;r r&auml;tt $i$.</p>

### 출력

<p>Ett heltal, det minsta beloppet som Anthony beh&ouml;ver betala f&ouml;r att v&auml;nnerna ska best&auml;lla minst $k$ olika r&auml;tter. Om det &auml;r om&ouml;jligt, skriv ut $-1$. Notera att svaret inte n&ouml;dv&auml;ndigtvis f&aring;r plats i ett $32$-bitars heltal.</p>

### 힌트

<p>I det f&ouml;rsta exempelfallet kan Anthony betala $2$ kronor f&ouml;r att v&auml;n $1$ ska byta fr&aring;n den f&ouml;rsta till den tredje r&auml;tten. Efter det best&auml;lls $3$ unika r&auml;tter: r&auml;tt $1$, r&auml;tt $2$ och r&auml;tt $3$.</p>

<p>I det andra exempelfallet finns det tv&aring; r&auml;tter som b&aring;da kostar $10$ kronor, och b&aring;da v&auml;nnerna har valt den f&ouml;rsta r&auml;tten. D&aring; det inte finns n&aring;gon dyrare r&auml;tt &auml;n den f&ouml;rsta kan inte Anthony g&ouml;ra n&aring;got f&ouml;r att &auml;ndra v&auml;nnernas val, och kan aldrig uppn&aring; $2$ unika r&auml;tter. Svaret blir d&aring; $-1$.</p>

<p>I det tredje exempelfallet vill v&auml;nnerna redan ha tv&aring; olika r&auml;tter, s&aring; Anthony beh&ouml;ver inte betala n&aring;gonting.</p>

<p>I det sista exempelfallet vill Anthony se till att alla $8$ v&auml;nner best&auml;ller olika r&auml;tter. Det billigaste alternativet h&auml;r &auml;r att betala f&ouml;r att v&auml;n $3$, $4$, $7$ och $8$ ska uppgradera till en av $1\,000\,000\,000$-kronorsr&auml;tterna. Totalt kostar det $3\,999\,999\,990$ kronor.</p>