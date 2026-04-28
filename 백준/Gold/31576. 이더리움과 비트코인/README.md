# [Gold II] 이더리움과 비트코인 - 31576

[문제 링크](https://www.acmicpc.net/problem/31576)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 16, 맞힌 사람: 11, 정답 비율: 39.286%

### 분류

수학, 정수론, 확장 유클리드 호제법

### 문제 설명

<p>용국이는 비트코인 투자로 1억을 벌었다고 하는 세운이에게 홀려서 비트코인을 사려고 한다. 세운이는 암호화폐는 비트코인 말고도 이더리움, 리플 등이 있다고 용국이에게 다른 화폐 투자를 권하고 있다. 그러나 용국이는 현재 중국에 있어 거래소 사이트에 접속할 수 없다. 즉, 용국이는 세운이에게 암호화폐의 시세를 물어봐야 한다.</p>

<p>비트코인의 시세는 &lsquo;$1$ <code>BTC</code> = $B$달러&rsquo; 이며, 이더리움의 시세는 &lsquo;$1$ <code>ETH</code> = $E$달러&rsquo;이다. $B$와 $E$는 모두 $2$ 이상 $10^4$ 이하인 양의 정수이다. 재미있게도 $B$와 $E$는 서로소(두 수의 최대공약수가 1)이다.</p>

<p>세운이는 용국이에게 시세를 직접 알려주면 재미없다고 생각하여, 용국이가 $K$달러를 말하면 세운이는 &lsquo;$K$달러로 정확히 $p$ <code>BTC</code>와 $q$ <code>ETH</code>를 살 수 있다&rsquo;라고 답해준다 (단, $p$, $q$는 0 이상의 정수). 그러나 $K$가 너무 작으면 정확히 $K$달러로 비트코인과 이더리움을 환전할 수 없을 수 있다.</p>

<p>용국이는 세운이에게 몇 번 질문을 해서 비트코인과 이더리움의 시세를 알아보려고 한다. 용국이를 도와 암호화폐의 시세를 구하는 프로그램을 작성하여라.</p>

### 입력

<p>당신은 비트코인과 이더리움의 시세를 구하는 함수 <code>GetExchangePrice()</code> 를 작성해야 한다. (<code>GetExchangePrice()</code> 함수는 ethereum.c / ethereum.cpp에 있다.)</p>

<p>ethereum.h 에 구조체 <code>excinfo</code> 가 있는데, <code>excinfo</code> 에는 다음과 같은 인자가 있다.</p>

<ul>
	<li><code>long long BTC</code>: 비트코인 관련 정보</li>
	<li><code>long long ETH</code>: 이더리움 관련 정보</li>
</ul>

<p><code>excinfo GetExchangePrice()</code> 함수는 인수가 없다. 이 함수는 다음 값을 반환해야 한다.</p>

<ul>
	<li>반환값$.BTC$: $1$ <code>BTC</code>의 가격(달러 단위)</li>
	<li>반환값$.ETH$: $1$ <code>ETH</code>의 가격(달러 단위)</li>
</ul>

<p>당신은 <code>GetExchangePrice</code> 함수 안에서 <code>Exchange(K)</code> 를 몇 번 호출할 수 있다.</p>

<p><code>excinfo Exchange(long long K)</code> 는 $K$달러로 비트코인과 이더리움을 환전하는 함수이다.</p>

<ul>
	<li>$K$: 환전할 돈의 가격 ($1 \le K \le 10^8$)</li>
	<li>반환값$.BTC$: $K$달러를 환산했을 때 비트코인의 수</li>
	<li>반환값$.ETH$: $K$달러를 환산했을 때 이더리움의 수</li>
	<li>만약 $K$달러를 환산할 수 없으면 반환값$.BTC$와 반환값$.ETH$는 모두 $-1$이다.</li>
</ul>

<p><code>GetExchangePrice()</code> 함수의 반환값이 실제 정답과 일치해야 한다. 만약 그렇지 않다면 채점 프로그램은 <code>Wrong[1]</code>을 출력한다. 함수를 호출할 때 인자의 범위를 벗어난다면 <code>Wrong[2]</code>를 출력하고 프로그램이 즉시 끝난다. 만약 <code>Exchange(K)</code>을 특정 횟수를 초과하여 호출하면 <code>Wrong[3]</code>을 출력하고 프로그램이 즉시 끝난다.</p>

<p><code>Exchange(K)</code> 함수는 최대 $5$번 호출할 수 있다.</p>

<p>예시 프로그램은 다음과 같다. 주석은 예제와 같은 상황에서 함수의 반환값을 의미한다.</p>

<pre style="margin: 0; line-height: 125%">
<span style="color: #BC7A00">#include &quot;ethereum.h&quot;</span>

excinfo <span style="color: #0000FF">GetExchangePrice</span>() {
	excinfo A <span style="color: #666666">=</span> Exchange(<span style="color: #666666">8098</span>); <span style="color: #408080; font-style: italic">// A.BTC = 2, A.ETH = 10</span>
	excinfo ret;
	ret.BTC <span style="color: #666666">=</span> <span style="color: #666666">2904</span>, ret.ETH <span style="color: #666666">=</span> <span style="color: #666666">229</span>;
	<span style="color: #008000; font-weight: bold">return</span> ret;
}</pre>

<p> </p>

<p>채점 프로그램은 처음에 정답(비트코인과 이더리움의 시세)을 정하며 당신의 호출에 따라 정답을 바꾸지 않는다(Non-Adaptive). 메모리 접근, 시스템 호출 등의 비정상적인 방법을 사용하면 오답 처리될 수 있음에 유의하여라.</p>

### 출력



### 힌트

<p>문제 페이지에서 샘플 코드를 다운로드받을 수 있다. 만약 Visual Studio나 Eclipse, Code::Blocks와 같은 IDE 툴을 사용한다면 ethereum.cpp, ethereum.h, grader.cpp (또는 ethereum.c ethereum.h, grader.c)를 한 프로젝트에 넣어서 컴파일하면 된다. 터미널에서 코드를 컴파일한다면 아래 컴파일 명령어를 이용하면 된다.</p>

<ul>
	<li>C / gcc: <code class="compilation_command">gcc -Wall -lm -static -o ethereum -O2 ethereum.c grader.c</code></li>
	<li>C++ / G++: <code class="compilation_command">g++ -Wall -lm -static -o ethereum -O2 ethereum.cpp grader.cpp</code></li>
</ul>

<p>프로그램을 실행한 후 표준입력(stdin)으로 비트코인의 시세 $B$와 이더리움의 시세 $E$를 입력받는다. 모든 정보를 입력받으면 샘플 채점기는 정답/오답 여부를 출력한다.</p>

<p>답안을 제출할 때에는 ethereum.c 또는 ethereum.cpp에 해당하는 코드만 제출하면 된다.</p>