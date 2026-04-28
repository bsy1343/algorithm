# [Platinum II] Strumpmatchning 2 - 26917

[문제 링크](https://www.acmicpc.net/problem/26917)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

자료 구조, 그리디 알고리즘, 연결 리스트, 매개 변수 탐색, 우선순위 큐

### 문제 설명

<p>Arash har nu kommit hem fr&aring;n onsite-finalen i Link&ouml;ping och &auml;r tillbaka i vardagen. Nu har han precis kommit hem fr&aring;n ett tv&auml;ttstugebes&ouml;k och ska &aring;terigen matcha strumpor. N&auml;r han nu sitter d&auml;r med sina $N$ strumpor s&aring; k&auml;nner han att han bara beh&ouml;ver $K$ par strumpor, resten kan f&aring; f&ouml;rbli osorterade. Det &auml;r allts&aring; okej om $N-2K$ strumpor f&ouml;rblir omatchade, t&auml;nker Arash.</p>

<p>Varje strumpa en f&auml;rg $F_i$. Tv&aring; strumpor $i$ och $j$ kan paras ihop om skillnaden i f&auml;rg strikt understiger heltalet $D$ d.v.s. $|F_{i} - F_{j}|&lt;D$. Men ist&auml;llet f&ouml;r att hj&auml;lpa Arash matcha s&aring; m&aring;nga strumpor som m&ouml;jligt s&aring; ska du hj&auml;lpa honom att hitta det minsta m&ouml;jliga $D$ s&aring; att han kan matcha minst $K$ strumppar!</p>

### 입력

<p>Indata best&aring;r av en rad med de tv&aring; heltalen $N$ och $K$ ($2 \le N \le 50\,000$, $2 \le 2K \le N$).</p>

<p>D&auml;refter f&ouml;ljer en rad med $N$ heltal: $F_1, F_2, \dots, F_N$. Talen $F_i$ ligger mellan $1$ och $10^{15}$ (inklusive).</p>

### 출력

<p>Du ska skriva ut ett enda heltal: den minimala differens $D$ som g&ouml;r att Arash kan matcha minst $K$ strumppar med varandra.</p>