# [Gold IV] 스러피 - 14906

[문제 링크](https://www.acmicpc.net/problem/14906)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 913, 정답: 386, 맞힌 사람: 268, 정답 비율: 40.060%

### 분류

문자열, 재귀, 정규 표현식

### 문제 설명

<p>스러피(Slurpy)란 다음에서 설명할 어떠한 속성이 존재하는 문자열을 지칭한다. 문자열을 읽어서 스러피가 존재하는지를 판단하는 프로그램을 작성하라.</p>

<p>우선, 스럼프(Slump)는 다음 조건을 만족하는 문자열이다.</p>

<ol>
	<li>첫 번째 문자가 &lsquo;D&rsquo; 또는 &lsquo;E&rsquo; 이다.</li>
	<li>첫 번째 문자 뒤에는 하나 이상의 &lsquo;F&rsquo;가 반복되어 연달아 나온다.</li>
	<li>위 2의 조건에서 반복되는 &lsquo;F&rsquo; 뒤에는 또 다른 스럼프나 &lsquo;G&rsquo;가 온다. 따라서 항상 스럼프는 &lsquo;F&rsquo; 끝에 오는 스럼프나 &lsquo;G&rsquo;로 끝난다. 예를 들어, DFFEFFFG는 첫 번째 문자가 &lsquo;D&rsquo;로 시작하고 두 개의 &lsquo;F&rsquo;가 연달아 나오며, 또 다른 스럼프 &lsquo;EFFFG&rsquo;로 끝난다. (똑같은 방식으로 &lsquo;EFFFG&rsquo;는 스럼프임을 알 수 있다)</li>
	<li>위의 경우가 아니면 스럼프가 아니다.</li>
</ol>

<p>그리고 스림프(Slimp)는 다음 조건을 만족하는 문자열을 말한다.</p>

<ol>
	<li>첫 번째 문자는 &lsquo;A&rsquo;이다.</li>
	<li>두개의 문자로만 된 스림프이라면 두 번째 문자는 &lsquo;H&rsquo;이다.</li>
	<li>세 개이상의 문자로 된 스림프라면 다음중 하나의 형식을 띈다.
	<ol>
		<li>&lsquo;A&rsquo; + &lsquo;B&rsquo; + 스림프 + &lsquo;C&rsquo;</li>
		<li>&lsquo;A&rsquo; + 스럼프 + &lsquo;C&rsquo;</li>
	</ol>
	</li>
	<li>스림프는 길이 2이상이며, 위의 경우가 아니면 스림프가 아니다</li>
</ol>

<p>마지막으로 스러피는 &lsquo;스림프 + 스럼프&rsquo;로 구성되는 문자열이라고 정의한다.</p>

<p>예를 들어,</p>

<ul>
	<li>Slumps: DFG, EFG, DFFFFFG, DFDFDFDFG, DFEFFFFFG</li>
	<li>Not Slumps: DFEFF, EFAHG, DEFG, DG, EFFFFDG</li>
	<li>Slimps: AH, ABAHC, ABABAHCC, ADFGC, ADFFFFGC, ABAEFGCC, ADFDFGC</li>
	<li>Not Slimps: ABC, ABAH, DFGC, ABABAHC, SLIMP, ADGC</li>
	<li>Slurpys: AHDFG, ADFGCDFFFFFG, ABAEFGCCDFEFFFFFG</li>
	<li>Not Slurpys: AHDFGA, DFGAH, ABABCC</li>
</ul>

### 입력

<p>첫 번째 줄에는 입력될 문자열의 개수를 나타내는 10보다 작거나 같은 양의 정수 N이 주어진다. 다음 줄부터 N개의 문자열이 입력된다. 문자열의 길이는 60 이하이며 알파벳 대문자로만 이루어져 있다..</p>

### 출력

<p>첫 줄에는 &ldquo;SLURPYS OUTPUT&rdquo;을 출력한다. N개의 문자열 입력에 대해서 각 문자열이 스러피인지를 &ldquo;YES&rdquo; 또는 &ldquo;NO&rdquo;로 표기한다. 마지막으로 &lsquo;END OF OUTPUT&rdquo;를 출력한다.</p>