# [Gold IV] 도깨비불 - 18109

[문제 링크](https://www.acmicpc.net/problem/18109)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 800, 정답: 135, 맞힌 사람: 101, 정답 비율: 20.570%

### 분류

구현, 문자열, 집합과 맵, 많은 조건 분기

### 문제 설명

<p style="text-align: center;"><img alt="2-set and QWERTY keyboard" src="%EB%B0%B1%EC%A4%80/Gold/18109.%E2%80%85%EB%8F%84%EA%B9%A8%EB%B9%84%EB%B6%88/0db847d9.png" data-original-src="https://upload.acmicpc.net/174db09b-1afb-412c-90b9-4c397df888a8/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 1000px;" /></p>

<p>한글 두벌식 자판을 사용하다 보면, 다른 입력 방식에서는 찾아보기 힘든&nbsp;<strong>도깨비불 현상</strong>이라는 특이한 현상을&nbsp;경험할&nbsp;수 있다. 예를 들어 &ldquo;<em>서강대학교</em>&rdquo;를 입력할 때 글쇠 입력 하나하나를 추적해 보자:</p>

<pre>
ㅅ
서
<strong>석</strong>
<strong>서가</strong>
서강
서강ㄷ
서강대
<strong>서강댛
서강대하</strong>
서강대학
서강대학ㄱ
서강대학교</pre>

<p>&ldquo;석&rdquo; 에서 &ldquo;서가&rdquo;로 변할 때, 다음 글자의 초성이 될 자음이 입력하고 있는 글자의 종성 위치에 먼저 붙는 현상이 일어난다. 이를 &lsquo;<strong>도깨비불 현상</strong>&rsquo;이라고 한다.</p>

<p>&ldquo;서강대학교&rdquo;를 입력할 때는&nbsp;도깨비불 현상이 2회 발생했다. 다른 예시도 보자.</p>

<table class="table table-bordered" style="width: 500px;">
	<tbody>
		<tr>
			<th>입력</th>
			<th>영문 모드 입력</th>
			<th>도깨비불 횟수</th>
		</tr>
		<tr>
			<td>이보세요</td>
			<td>dlqhtpdy</td>
			<td>3회</td>
		</tr>
		<tr>
			<td>코딩하기 싫다</td>
			<td>zheldgkrl tlfgek</td>
			<td>2회</td>
		</tr>
		<tr>
			<td>마춤뻐비 틀려써요</td>
			<td>akcnaQjql xmffuTjdy</td>
			<td>4회</td>
		</tr>
	</tbody>
</table>

<ul>
	<li>이보세요 : (&ldquo;입&rdquo;&nbsp;&rarr; &ldquo;이보&rdquo;), (&ldquo;이봇&rdquo;&nbsp;&rarr; &ldquo;이보세&rdquo;), (&ldquo;이보셍&rdquo; &rarr; &ldquo;이보세요&rdquo;)</li>
	<li>코딩하기 싫다 : (&ldquo;콛&rdquo;&nbsp;&rarr; &ldquo;코딩&rdquo;), (&ldquo;코딩학&rdquo;&nbsp;&rarr; &ldquo;코딩하기&rdquo;)</li>
	<li>마춤뻐비 틀려써요 : (&ldquo;맟&rdquo; &rarr; &ldquo;마추&rdquo;), (&ldquo;마춤뻡&rdquo; &rarr; &ldquo;마춤뻐비&rdquo;), (&ldquo;마춤뻐비 틀렸&rdquo; &rarr; &ldquo;마춤뻐비 틀려써&rdquo;), (&ldquo;마춤뻐비 틀려썽&rdquo; &rarr; &ldquo;마춤뻐비 틀려써요&rdquo;)</li>
</ul>

<p>문자열이 주어지면 그 문자열을 키보드로 입력했을 때 도깨비불 현상의 횟수를 계산해보자.</p>

### 입력

<p>첫 번째 줄에 공백 문자(<code><tt><span style="background-color:#dddddd;"> </span></tt></code>)와 완성형 한글들로 이루어진&nbsp;한글 문자열을 영문 입력 모드에서 타이핑했을&nbsp;때 입력되는 문자열이 주어진다. 문자열의 길이는 1 이상 10<sup>4</sup>&nbsp;이하이다.</p>

### 출력

<p>입력으로 주어진 문자열을 한글 입력 모드로 타이핑했을 때 발생하는 도깨비불 현상의 횟수를 출력하라.</p>

### 힌트

<table class="table table-bordered">
	<tbody>
		<tr>
			<td><strong>초성</strong></td>
			<td><strong><code>ㄱ</code></strong></td>
			<td><strong><code>ㄲ</code></strong></td>
			<td><strong><code>ㄴ</code></strong></td>
			<td><strong><code>ㄷ</code></strong></td>
			<td><strong><code>ㄸ</code></strong></td>
			<td><strong><code>ㄹ</code></strong></td>
			<td><strong><code>ㅁ</code></strong></td>
			<td><strong><code>ㅂ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">r</span></code></td>
			<td><code><span style="background-color:#dddddd;">R</span></code></td>
			<td><code><span style="background-color:#dddddd;">s</span></code></td>
			<td><code><span style="background-color:#dddddd;">e</span></code></td>
			<td><code><span style="background-color:#dddddd;">E</span></code></td>
			<td><code><span style="background-color:#dddddd;">f</span></code></td>
			<td><code><span style="background-color:#dddddd;">a</span></code></td>
			<td><code><span style="background-color:#dddddd;">q</span></code></td>
		</tr>
		<tr>
			<td><strong>초성</strong></td>
			<td><strong><code>ㅃ</code></strong></td>
			<td><strong><code>ㅅ</code></strong></td>
			<td><strong><code>ㅆ</code></strong></td>
			<td><strong><code>ㅇ</code></strong></td>
			<td><strong><code>ㅈ</code></strong></td>
			<td><strong><code>ㅉ</code></strong></td>
			<td><strong><code>ㅊ</code></strong></td>
			<td><strong><code>ㅋ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">Q</span></code></td>
			<td><code><span style="background-color:#dddddd;">t</span></code></td>
			<td><code><span style="background-color:#dddddd;">T</span></code></td>
			<td><code><span style="background-color:#dddddd;">d</span></code></td>
			<td><code><span style="background-color:#dddddd;">w</span></code></td>
			<td><code><span style="background-color:#dddddd;">W</span></code></td>
			<td><code><span style="background-color:#dddddd;">c</span></code></td>
			<td><code><span style="background-color:#dddddd;">z</span></code></td>
		</tr>
		<tr>
			<td><strong>초성</strong></td>
			<td><strong><code>ㅌ</code></strong></td>
			<td><strong><code>ㅍ</code></strong></td>
			<td><strong><code>ㅎ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">x</span></code></td>
			<td><code><span style="background-color:#dddddd;">v</span></code></td>
			<td><code><span style="background-color:#dddddd;">g</span></code></td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td><strong>중성</strong></td>
			<td><strong><code>ㅏ</code></strong></td>
			<td><strong><code>ㅐ</code></strong></td>
			<td><strong><code>ㅑ</code></strong></td>
			<td><strong><code>ㅒ</code></strong></td>
			<td><strong><code>ㅓ</code></strong></td>
			<td><strong><code>ㅔ</code></strong></td>
			<td><strong><code>ㅕ</code></strong></td>
			<td><strong><code>ㅖ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">k</span></code></td>
			<td><code><span style="background-color:#dddddd;">o</span></code></td>
			<td><code><span style="background-color:#dddddd;">i</span></code></td>
			<td><code><span style="background-color:#dddddd;">O</span></code></td>
			<td><code><span style="background-color:#dddddd;">j</span></code></td>
			<td><code><span style="background-color:#dddddd;">p</span></code></td>
			<td><code><span style="background-color:#dddddd;">u</span></code></td>
			<td><code><span style="background-color:#dddddd;">P</span></code></td>
		</tr>
		<tr>
			<td><strong>중성</strong></td>
			<td><strong><code>ㅗ</code></strong></td>
			<td><strong><code>ㅘ</code></strong></td>
			<td><strong><code>ㅙ</code></strong></td>
			<td><strong><code>ㅚ</code></strong></td>
			<td><strong><code>ㅛ</code></strong></td>
			<td><strong><code>ㅜ</code></strong></td>
			<td><strong><code>ㅝ</code></strong></td>
			<td><strong><code>ㅞ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">h</span></code></td>
			<td><code><span style="background-color:#dddddd;">hk</span></code></td>
			<td><code><span style="background-color:#dddddd;">ho</span></code></td>
			<td><code><span style="background-color:#dddddd;">hl</span></code></td>
			<td><code><span style="background-color:#dddddd;">y</span></code></td>
			<td><code><span style="background-color:#dddddd;">n</span></code></td>
			<td><code><span style="background-color:#dddddd;">nj</span></code></td>
			<td><code><span style="background-color:#dddddd;">np</span></code></td>
		</tr>
		<tr>
			<td><strong>중성</strong></td>
			<td><strong><code>ㅟ</code></strong></td>
			<td><strong><code>ㅠ</code></strong></td>
			<td><strong><code>ㅡ</code></strong></td>
			<td><strong><code>ㅢ</code></strong></td>
			<td><strong><code>ㅣ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">nl</span></code></td>
			<td><code><span style="background-color:#dddddd;">b</span></code></td>
			<td><code><span style="background-color:#dddddd;">m</span></code></td>
			<td><code><span style="background-color:#dddddd;">ml</span></code></td>
			<td><code><span style="background-color:#dddddd;">l</span></code></td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td><strong>종성</strong></td>
			<td><strong><code>ㄱ</code></strong></td>
			<td><strong><code>ㄲ</code></strong></td>
			<td><strong><code>ㄳ</code></strong></td>
			<td><strong><code>ㄴ</code></strong></td>
			<td><strong><code>ㄵ</code></strong></td>
			<td><strong><code>ㄶ</code></strong></td>
			<td><strong><code>ㄷ</code></strong></td>
			<td><strong><code>ㄹ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">r</span></code></td>
			<td><code><span style="background-color:#dddddd;">R</span></code></td>
			<td><code><span style="background-color:#dddddd;">rt</span></code></td>
			<td><code><span style="background-color:#dddddd;">s</span></code></td>
			<td><code><span style="background-color:#dddddd;">sw</span></code></td>
			<td><code><span style="background-color:#dddddd;">sg</span></code></td>
			<td><code><span style="background-color:#dddddd;">e</span></code></td>
			<td><code><span style="background-color:#dddddd;">f</span></code></td>
		</tr>
		<tr>
			<td><strong>종성</strong></td>
			<td><strong><code>ㄺ</code></strong></td>
			<td><strong><code>ㄻ</code></strong></td>
			<td><strong><code>ㄼ</code></strong></td>
			<td><strong><code>ㄽ</code></strong></td>
			<td><strong><code>ㄾ</code></strong></td>
			<td><strong><code>ㄿ</code></strong></td>
			<td><strong><code>ㅀ</code></strong></td>
			<td><strong><code>ㅁ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">fr</span></code></td>
			<td><code><span style="background-color:#dddddd;">fa</span></code></td>
			<td><code><span style="background-color:#dddddd;">fq</span></code></td>
			<td><code><span style="background-color:#dddddd;">ft</span></code></td>
			<td><code><span style="background-color:#dddddd;">fx</span></code></td>
			<td><code><span style="background-color:#dddddd;">fv</span></code></td>
			<td><code><span style="background-color:#dddddd;">fg</span></code></td>
			<td><code><span style="background-color:#dddddd;">a</span></code></td>
		</tr>
		<tr>
			<td><strong>종성</strong></td>
			<td><strong><code>ㅂ</code></strong></td>
			<td><strong><code>ㅄ</code></strong></td>
			<td><strong><code>ㅅ</code></strong></td>
			<td><strong><code>ㅆ</code></strong></td>
			<td><strong><code>ㅇ</code></strong></td>
			<td><strong><code>ㅈ</code></strong></td>
			<td><strong><code>ㅊ</code></strong></td>
			<td><strong><code>ㅋ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">q</span></code></td>
			<td><code><span style="background-color:#dddddd;">qt</span></code></td>
			<td><code><span style="background-color:#dddddd;">t</span></code></td>
			<td><code><span style="background-color:#dddddd;">T</span></code></td>
			<td><code><span style="background-color:#dddddd;">d</span></code></td>
			<td><code><span style="background-color:#dddddd;">w</span></code></td>
			<td><code><span style="background-color:#dddddd;">c</span></code></td>
			<td><code><span style="background-color:#dddddd;">z</span></code></td>
		</tr>
		<tr>
			<td><strong>종성</strong></td>
			<td><strong><code>ㅌ</code></strong></td>
			<td><strong><code>ㅍ</code></strong></td>
			<td><strong><code>ㅎ</code></strong></td>
		</tr>
		<tr>
			<td>영문 입력</td>
			<td><code><span style="background-color:#dddddd;">x</span></code></td>
			<td><code><span style="background-color:#dddddd;">v</span></code></td>
			<td><code><span style="background-color:#dddddd;">g</span></code></td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>

<p>입력 자판은 앞서 첨부한 두벌식 자판 이미지를 참고한다. (한글 자판은 두벌식, 영문 자판은 QWERTY이다.)</p>

<p>쌍자음 <code><span style="background-color:#dddddd;">ᄁ</span></code>, <code><span style="background-color:#dddddd;">ㄸ</span></code>, <code><span style="background-color:#dddddd;">ㅃ</span></code>, <code><span style="background-color:#dddddd;">ㅆ</span></code>, <code><span style="background-color:#dddddd;">ㅉ</span></code>은 각각 <code><span style="background-color:#dddddd;">R</span></code>, <code><span style="background-color:#dddddd;">E</span></code>, <code><span style="background-color:#dddddd;">Q</span></code>, <code><span style="background-color:#dddddd;">T</span></code>, <code><span style="background-color:#dddddd;">W</span></code>에 대응되며,&nbsp;<code><span style="background-color:#dddddd;">rr</span></code>, <code><span style="background-color:#dddddd;">ee</span></code>, <code><span style="background-color:#dddddd;">qq</span></code>,&nbsp;<code><span style="background-color:#dddddd;">tt</span></code>, <code><span style="background-color:#dddddd;">ww</span></code>와 같은 방법으로는 입력할 수 없다.</p>

<p>초성은 19개, 중성은 21개, 종성은 27개가 있다.</p>