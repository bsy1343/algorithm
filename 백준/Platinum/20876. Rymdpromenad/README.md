# [Platinum V] Rymdpromenad - 20876

[문제 링크](https://www.acmicpc.net/problem/20876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 14, 맞힌 사람: 12, 정답 비율: 50.000%

### 분류

수학, 그리디 알고리즘, 정렬

### 문제 설명

<p>Astronauten Gustav tj&auml;nstg&ouml;r p&aring; en rymdstation best&aring;ende av $n$ moduler ihopsatta i en cirkel s&aring; att modul $1$ sitter ihop med modul $2$, $2$ med $3$, o.s.v. (och modul $n$ sitter ihop med modul $1$). Avst&aring;ndet mellan tv&aring; n&auml;rliggande moduler &auml;r $1$. F&ouml;r att skapa en slags konstgjord gravitation roterar rymdstationen med konstant hastighet runt cirkelns mittpunkt.</p>

<p>Stationen har varit i rymden ett bra tag och det b&ouml;rjar bli dags att putsa utsidan av f&ouml;nstren. Lotten har fallit p&aring; Gustav att g&ouml;ra detta. Det finns $m$ f&ouml;nster numrerade fr&aring;n $1$ till $m$, d&auml;r f&ouml;nster nummer $i$ sitter p&aring; modul nummer $a_i$. Av n&aring;gon anledning m&aring;ste f&ouml;nstrena putsas i just den h&auml;r ordningen. Den enda ing&aring;ngen och utg&aring;ngen till stationen finns vid modul $1$.</p>

<p>F&ouml;r att ta sig mellan modulerna finns det en raketdriven f&ouml;nsterhiss som g&aring;r l&auml;ngs utsidan av stationen. F&ouml;nsterhissen kan bara f&auml;rdas mellan n&auml;rliggande moduler, och kan allts&aring; inte ta n&aring;gra genv&auml;gar. Gustav vill v&auml;lja en v&auml;g fr&aring;n modul $1$, runt till alla f&ouml;nstrena, och tillbaka till modul $1$. Tyv&auml;rr finns det tv&aring; problem: dels har hissen begr&auml;nsat med br&auml;nsle, s&aring; Gustav m&aring;ste v&auml;lja en v&auml;g som minimerar avst&aring;ndet han f&auml;rdas. Dessutom p&aring;verkar hissens r&ouml;relser rymdstationens rotation, d&auml;rf&ouml;r m&aring;ste den f&auml;rdas lika mycket medsols som motsols.</p>

<p>Hitta det minsta avst&aring;ndet Gustav kan f&auml;rdas s&aring; att han b&ouml;rjar vid modul $1$, bes&ouml;ker alla f&ouml;nster i r&auml;tt ordning, &aring;terv&auml;nder till modul $1$, och f&auml;rdas lika mycket motsols som medsols.</p>

### 입력

<p>Den f&ouml;rsta raden inneh&aring;ller tv&aring; heltal $n$ och $m$: antalet moduler och antalet f&ouml;nster ($3 \leq n \leq 10^5$ , $1 \leq m \leq 10^5$). Den andra raden inneh&aring;ller $m$ heltal, index p&aring; f&ouml;nstren ($1 \leq a_i \leq n$).</p>

### 출력

<p>Ett heltal, det minsta avst&aring;ndet.</p>