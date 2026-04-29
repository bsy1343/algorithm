# [Platinum V] snöflinga - 34329

[문제 링크](https://www.acmicpc.net/problem/34329)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 44, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

구현, 분할 정복, 재귀

### 문제 설명

<p>진호는 하늘에서 내려온 눈송이 하나를 확대해서 관찰했다.</p>

<p>눈송이 하나에는 수많은 눈 결정이 들어있고, 확대를 해도 축소를 해도 같은 패턴을 가지고 있었다.</p>

<p>크기 1의 패턴은 5개의 결정이 밑변이고 가운데 한 칸이 비어 있도록 삼각형 모양을 하고 있다.</p>

<pre style="width: fit-content; margin: 0 auto; font-size: 0.8em; padding: 10px; border: 1px solid #ccc; background-color: #f9f9f9;">  *
 * *
*****
</pre>

<p>크기를 확대하면 각 변을 3등분 했을 때 가운데에서 계속해서 삼각형이 보이는 패턴을 하고 있다.</p>

<pre style="width: fit-content; margin: 0 auto; font-size: 0.8em; padding: 10px; border: 1px solid #ccc; background-color: #f9f9f9;">      *
     * *
*****   *****
</pre>
<p></p>
<pre style="width: fit-content; margin: 0 auto; font-size: 0.8em; padding: 10px; border: 1px solid #ccc; background-color: #f9f9f9;">                  *
                 * *
            *****   *****
             *         *
      *       *       *       *
     * *     *         *     * *
*****   *****           *****   *****
</pre>
<p></p>
<pre style="width: fit-content; margin: 0 auto; font-size: 0.8em; padding: 10px; border: 1px solid #ccc; background-color: #f9f9f9;">                                                      *
                                                     * *
                                                *****   *****
                                                 *         *
                                          *       *       *       *
                                         * *     *         *     * *
                                    *****   *****           *****   *****
                                     *                                 *
                                      *                               *
                                     *                                 *
                                    *****                           *****
                                         *                         *
                  *                       *                       *                       *
                 * *                     *                         *                     * *
            *****   *****           *****                           *****           *****   *****
             *         *             *                                 *             *         *
      *       *       *       *       *                               *       *       *       *       *
     * *     *         *     * *     *                                 *     * *     *         *     * *
*****   *****           *****   *****                                   *****   *****           *****   *****

</pre>

<p style="text-align: center;">눈송이의 일부분을 확대했을 때의 예시</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34329.%E2%80%85sn%C3%B6flinga/01747b9a.png" data-original-src="https://boja.mercury.kr/assets/problem/34329-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p style="text-align: center;">크기 1부터 4까지 눈송이의 모양</p>

<p>확대한 크기 N이 주어질 때, 주어지는 크기의 눈송이를 출력해보자.</p>

### 입력

<p>첫째 줄에 눈송이의 크기를 나타내는 정수 $N$ $(1 \le N \le 8)$ 이 주어진다.</p>

### 출력

<p>주어진 크기의 눈송이를 출력한다.</p>

<p>출력하는 각 줄의 마지막 <strong>*</strong> 문자 이후에는 <strong>개행을 제외한 아무 문자도 출력하지 않는다</strong>.</p>

### 힌트

<p>출력해야하는 눈송이의 크기가 크기 때문에 빠른 입출력을 사용하는 것을 권장한다. 대표적인 언어별 빠른 입출력 방법은 다음과 같다.</p>

<ul>
	<li>C++ : cin, cout을 사용할 경우, 입출력 전에 cin.tie(nullptr); ios::sync_with_stdio(false);를 적용한다. (이 설정 후에는 cin/cout &lt;-&gt; scanf/printf와의 혼용이 금지된다) 또한 줄바꿈 시에는 endl 대신 '\n'을 사용한다.</li>
	<li>Python3, PyPy3 : import sys를 통해 sys 모듈을 불러온다. 이후 입력을 받을 때는 input() 대신 sys.stdin.readline().rstrip()을 사용한다.</li>
	<li>Java : import java.io.*를 통해 java.io 패키지를 불러온다. 입력은 BufferedReader, 출력은 BufferedWriter를 사용한다. (필요 시 StringBuilder로 모아 한 번에 출력하는 방법도 가능하다)</li>
</ul>