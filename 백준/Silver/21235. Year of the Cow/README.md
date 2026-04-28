# [Silver I] Year of the Cow - 21235

[문제 링크](https://www.acmicpc.net/problem/21235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 661, 정답: 266, 맞힌 사람: 214, 정답 비율: 42.545%

### 분류

구현, 자료 구조, 그래프 이론, 문자열, 그래프 탐색, 집합과 맵, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>Farmer John&#39;s cows are excited to learn that Chinese New Year was recently celebrated, ushering in the year of the Ox, always a bovine favorite.</p>

<p>As we know, the zodiac animals for Chinese calendar years follow a 12-year cycle: Ox, Tiger, Rabbit, Dragon, Snake, Horse, Goat, Monkey, Rooster, Dog, Pig, Rat, and then Ox again.</p>

<p>Bessie the cow is proud to say she was born in a year of the Ox, many years ago. Her friend Elsie wants to know how many years apart from Bessie she was born, and hopes you can help her deduce this by looking at relationships between the birth years of several cows on the farm.</p>

### 입력

<p>The first line of input contains an integer $N$ ($1 \leq N \leq 100$). Each of the next $N$ lines contains an 8-word phrase specifying the relationship between the birth years of two cows. It is of the form</p>

<p>&quot;Mildred born in previous Dragon year from Bessie&quot;,</p>

<p>or</p>

<p>&quot;Mildred born in next Dragon year from Bessie&quot;</p>

<p>The last word is the name of a cow on the farm, which is either &quot;Bessie&quot; or a cow that has already been mentioned in a previous line of input.</p>

<p>The first word is the name of a cow on the farm who is not &quot;Bessie&quot; and who has not yet been mentioned in the input. All cow names have at most 10 characters that are in the range a..z or A..Z.</p>

<p>The 5th word is one of the 12 zodiac animals above.</p>

<p>The 4th word is either &quot;previous&quot; or &quot;next&quot;. For example, if the phrase is &quot;Mildred born in previous Dragon year from Bessie&quot;, then Mildred&#39;s year of birth was the Dragon year closest to and strictly before (not equal to) Bessie&#39;s birth year.</p>

### 출력

<p>Please output the number of years by which Bessie and Elsie&#39;s birth years differ. It is guaranteed that this number can be determined by the input given.</p>

### 힌트

<p>In the input above,</p>

<ul>
	<li>Elsie was born 12 years before Bessie.</li>
	<li>Mildred was born 9 years before Bessie.</li>
	<li>Gretta was born 17 years before Bessie.</li>
	<li>Paulina was born 9 years after Bessie.</li>
</ul>