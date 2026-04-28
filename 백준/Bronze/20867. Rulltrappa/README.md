# [Bronze III] Rulltrappa - 20867

[문제 링크](https://www.acmicpc.net/problem/20867)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1307, 정답: 868, 맞힌 사람: 811, 정답 비율: 65.989%

### 분류

수학, 사칙연산

### 문제 설명

<p>Paulina Osqulda (Osqulda &auml;r en studentikos ben&auml;mning p&aring; teknologer som studerar vid Kungliga Tekniska h&ouml;gskolan i Stockholm, se <a href="https://sv.wikipedia.org/wiki/Osquar_och_Osqulda">https://sv.wikipedia.org/wiki/Osquar_och_Osqulda</a>.) pluggar p&aring; KTH i Stockholm, och &aring;ker varje morgon till skolan via tunnelbanan. N&auml;r hon kommer fram till sin tunnelbanestation m&aring;ste hon &aring;ka upp l&auml;ngs en rulltrappa f&ouml;r att komma ut.</p>

<p>I rulltrappan bildas det ofta tv&aring; olika k&ouml;er. P&aring; den h&ouml;gra sidan av trappan st&auml;ller sig folk som vill st&aring; still i rulltrappan, medan man st&auml;ller sig p&aring; den v&auml;nstra sidan om man f&ouml;redrar att g&aring; i rulltrappan (f&ouml;r att komma upp snabbare).</p>

<p>Paulina har m&auml;rkt att det oftast bildas en <em>j&auml;ttel&aring;ng</em> k&ouml; till den v&auml;nstra sidan av rulltrappan, eftersom alla &auml;r s&aring; stressade till jobbet och vill kunna g&aring; snabbt upp f&ouml;r rulltrappan. P&aring; sista tiden har hon funderat p&aring; om det kanske rentav skulle g&aring; snabbare att ist&auml;llet v&auml;lja den h&ouml;gra k&ouml;n, eftersom k&ouml;n d&auml;r ofta &auml;r kortare.</p>

<p>Rulltrappan &auml;r totalt $M$ trappsteg l&aring;ng. Om man st&aring;r i rulltrappan f&auml;rdas man $S$ trappsteg per sekund upp&aring;t i rulltrappan. Om man ist&auml;llet g&aring;r i rulltrappan f&auml;rdas man $G$ trappsteg per sekund upp&aring;t.</p>

<p>Totalt kan $A$ personer per sekund b&ouml;rja g&aring; i rulltrappan ur den v&auml;nstra k&ouml;n, medan $B$ personer per sekund kan st&auml;lla sig p&aring; rulltrappan ur den h&ouml;gra k&ouml;n. Detta betyder att i b&ouml;rjan av f&ouml;rloppet g&aring;r en person p&aring; rulltrappan. Innan en ny person g&aring;r p&aring; rulltrappan m&aring;ste denna v&auml;nta $\frac{1}{A}$ (resp $\frac{1}{B}$ sekunder) f&ouml;r att kunna g&aring; p&aring; rulltrappan.</p>

<p>Den v&auml;nstra k&ouml;n &auml;r f&ouml;r n&auml;rvarande $L$ personer l&aring;ng, och den h&ouml;gra &auml;r $R$ personer l&aring;ng.</p>

<p>Hj&auml;lp Paulina avg&ouml;ra vilken k&ouml; hon ska st&auml;lla sig i, f&ouml;r att s&aring; snabbt som m&ouml;jligt n&aring; rulltrappans topp.</p>

### 입력

<p>Den f&ouml;rsta raden i indatat best&aring;r av heltalen $M, S, G$ som &auml;r beskrivna i uppgiften. Det g&auml;ller att $30 \le M \le 200$, $1 \le S \le G \le M$.</p>

<p>N&auml;sta rad inneh&aring;ller decimaltalen $A, B$ som &auml;r beskrivna i uppgiften. Det g&auml;ller att $0.1 \le A, B \le 1$.</p>

<p>Den sista raden inneh&aring;ller heltalen $L, R$ som &auml;r beskrivna i uppgiften. Det g&auml;ller att $0 \le L, R \le 100$.</p>

### 출력

<p>Skriv ut <code>latmask</code> om det snabbaste alternativet &auml;r att v&auml;lja den h&ouml;gra k&ouml;n och st&aring; i rulltrappan, eller <code>friskus</code> om det snabbaste alternativet &auml;r att v&auml;lja den v&auml;nstra k&ouml;n och g&aring; i rulltrappan.</p>

<p>Det &auml;r garanterat att tiden det tar f&ouml;r Paulina att &aring;ka upp f&ouml;r rulltrappan skiljer sig med minst 1 sekund mellan de tv&aring; k&ouml;erna, s&aring; du beh&ouml;ver aldrig bry dig om fallet n&auml;r b&aring;da alternativen &auml;r lika snabba.</p>