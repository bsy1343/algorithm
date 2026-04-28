# [Platinum V] 한글 ㄴㄴ 수 - 1962

[문제 링크](https://www.acmicpc.net/problem/1962)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 42, 맞힌 사람: 28, 정답 비율: 29.474%

### 분류

수학, 구현, 문자열, 파싱, 임의 정밀도 / 큰 수 연산, utf-8 입력 처리

### 문제 설명

<p>세종대왕이 펴낸 훈민정음해례본은 <strong>1962년</strong>에 국보 70호로 지정되었다. 한글의 우수성을 널리 알리고 세종대왕이 이 훈민정음을 창제하여 반포한 사실을 기념하기 위한 목적으로, 한글이 반포된 날을 기념일로 매년 <strong>10월 9일</strong>을 국경일(<strong>한글날</strong>)로 지정하였다.</p>

<p>한글날을 기념하기 위해 수를 한글로 적어보자. $1$부터 $10^{52} - 1$까지의 수를 한글로 적을 때에는 일반적인 수의 한글 표기를 따른다. 다만 표기가 상황마다 다를 수 있으므로 통일을 위해 이 문제에서는 기존 한글 표기를 아래의 문법에 맞추어 적는다.</p>

<pre>
&lt;기수 1&gt; = &#39;일&#39; | &#39;이&#39; | &#39;삼&#39; | &#39;사&#39; | &#39;오&#39; | &#39;육&#39; | &#39;칠&#39; | &#39;팔&#39; | &#39;구&#39;
&lt;기수 2&gt; = &#39;십&#39; | &#39;백&#39; | &#39;천&#39;
&lt;기수 3&gt; = &#39;만&#39; | &#39;억&#39; | &#39;조&#39; | &#39;경&#39; | &#39;해&#39; | &#39;자&#39; | &#39;양&#39; | &#39;구&#39; | &#39;간&#39; | &#39;정&#39; | &#39;재&#39; | &#39;극&#39;
&lt;기수 4&gt; = &lt;기수 1&gt; | &lt;기수 1&gt; &lt;기수 2&gt; | &lt;기수 1&gt; &lt;기수 2&gt; &lt;기수 4&gt;
&lt;수의 한글 표기&gt; = &lt;기수 4&gt; | &lt;기수 4&gt; &lt;기수 3&gt; | &lt;기수 4&gt; &lt;기수 3&gt; &lt;수의 한글 표기&gt;
</pre>

<p>예를 들어 $1234\,5678\,9099\,8808\,7770\,0666\,0055\,4004\,3300\, 0002\,1000\,0000\,1962$는 &quot;일천이백삼십사<span style="color:#e74c3c;"><strong>극</strong></span>오천육백칠십팔<span style="color:#e74c3c;"><strong>재</strong></span>구천구십구<span style="color:#e74c3c;"><strong>정</strong></span>팔천팔백팔<span style="color:#e74c3c;"><strong>간</strong></span>칠천칠백칠십<span style="color:#e74c3c;"><strong>구</strong></span>육백육십육<span style="color:#e74c3c;"><strong>양</strong></span>오십오<span style="color:#e74c3c;"><strong>자</strong></span>사천사<span style="color:#e74c3c;"><strong>해</strong></span>삼천삼백<span style="color:#e74c3c;"><strong>경</strong></span>이<span style="color:#e74c3c;"><strong>조</strong></span>일천<span style="color:#e74c3c;"><strong>억</strong></span>일천구백육십이&quot;라고 쓰고, $21\,4748\,3647$는 &quot;이십일<span style="color:#e74c3c;"><strong>억</strong></span>사천칠백사십팔<span style="color:#e74c3c;"><strong>만</strong></span>삼천육백사십칠&quot;이라 쓴다.</p>

<p>우리 세계에서는 한글의 자음과 모음이 모두 존재하기에 위의 규칙을 따른다. 이제 일부 자음과 모음이 없는 다른 평행 세계를 상상해 보자. &#39;ㅇ (이응)&#39;이 없는 세계에서는 우리 세계의 수의 한글 표기로 &#39;ㅇ&#39;가 있다면, 그 수는 존재하지 않는 수로 취급한다. 따라서 &#39;$1$(일)&#39;, &#39;$2$(이)&#39;가 아닌 &#39;$3$(삼)&#39;이 첫 번째 양의 정수이다.</p>

<p>우리 세계에는 <span style="color:#3498db;"><strong>항하사</strong></span>, <span style="color:#3498db;"><strong>아승기</strong></span>, <span style="color:#3498db;"><strong>나유타</strong></span>, <span style="color:#3498db;"><strong>불가사의</strong></span>, <span style="color:#3498db;"><strong>무량대수</strong></span>와 같이 더 큰 수를 표현하는 단위가 존재하지만, 이 문제에서는 사용하지 않는다. 따라서 만약 수가 매우 커서 문제에서 통일한 한글 표기 문법으로 적을 수 없다면, 그 수 또한 존재하지 않는 수이다.</p>

<p>일부 자음과 모음이 없는 다른 평행 세계에서의 $N$번째 양의 정수를 우리 세계의 아라비아 숫자로 출력해 보자.</p>

### 입력

<p>총 $T$개의 테스트 케이스가 입력으로 주어지며, 첫 번째 줄에 $T$가 주어진다. $(1 \le T \le 1\,000)$</p>

<p>테스트 케이스의 첫 번째 줄에 양의 정수 $N$과 평행 세계에서 존재하지 않는 자음과 모음의 개수 $M$이 공백으로 구분되어 주어진다. $(1 \le N \le 10^{52} - 1$; $1 \le M \le 21)$</p>

<p>테스트 케이스의 두 번째 줄에는 평행 세계에서 존재하지 않는 자음과 모음이 중복 없이 공백으로 구분되어 주어진다. 자음은 <code><span style="color:#e74c3c;">ㄱ</span></code>, <code><span style="color:#e74c3c;">ㄴ</span></code>, <code><span style="color:#e74c3c;">ㄹ</span></code>, <code><span style="color:#e74c3c;">ㅁ</span></code>, <code><span style="color:#e74c3c;">ㅂ</span></code>, <code><span style="color:#e74c3c;">ㅅ</span></code>, <code><span style="color:#e74c3c;">ㅇ</span></code>, <code><span style="color:#e74c3c;">ㅈ</span></code>, <code><span style="color:#e74c3c;">ㅊ</span></code>, <code><span style="color:#e74c3c;">ㅍ</span></code>, <code><span style="color:#e74c3c;">ㅎ</span></code>로 $11$개 중에서만 주어진다. 모음은 <code><span style="color:#e74c3c;">ㅏ</span></code>, <code><span style="color:#e74c3c;">ㅐ</span></code>, <code><span style="color:#e74c3c;">ㅑ</span></code>, <code><span style="color:#e74c3c;">ㅓ</span></code>, <code><span style="color:#e74c3c;">ㅕ</span></code> <code><span style="color:#e74c3c;">ㅗ</span></code>, <code><span style="color:#e74c3c;">ㅜ</span></code>, <code><span style="color:#e74c3c;">ㅠ</span></code>, <code><span style="color:#e74c3c;">ㅡ</span></code>, <code><span style="color:#e74c3c;">ㅣ</span></code>로 $10$개 중에서만 주어진다.</p>

<p>주어지는 모든 입력은 UTF-8로 인코딩되어 주어진다.</p>

### 출력

<p>각 줄에 각 테스트 케이스마다 평행 세계에서의 $N$번째 양의 정수가</p>

<ul>
	<li>존재한다면 우리 세계의 아라비아 숫자로 출력한다.</li>
	<li>존재하지 않는다면 <code><span style="color:#e74c3c;">-1</span></code>을 출력한다.</li>
</ul>