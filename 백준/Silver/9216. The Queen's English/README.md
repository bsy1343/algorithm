# [Silver IV] The Queen's English - 9216

[문제 링크](https://www.acmicpc.net/problem/9216)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 93, 정답: 39, 맞힌 사람: 21, 정답 비율: 32.812%

### 분류

수학, 구현, 문자열, 사칙연산, 많은 조건 분기

### 문제 설명

<p>In the official British written word format for numbers, tens and units are separated by a hyphen, and hundreds are separated from tens or units by the word &quot;and&quot;. For example the number 123 would be written &quot;one hundred and twenty-three&quot;. Large numbers are written in &quot;triads&quot; (groups of three digits) followed by the appropriate suffixes. For example 123456 is &quot;one hundred and twenty-three thousand four hundred and fifty-six&quot;. As a special case, if the final triad of a large number has a tens or units component but no hundreds component, it needs an &quot;and&quot;. Thus 1001001 is &quot;one million one thousand and one&quot;.</p>

<p>Your task is to write a program that produces correct British written format for numbers of up to 9 digits (less than one &quot;short&quot; billion). Note that the correct spellings are &quot;fifteen&quot; and &quot;fifty&quot; (&#39;f&#39; instead of &#39;v&#39;), and &quot;forty&quot; (no &#39;u&#39;).</p>

### 입력

<p>Input will consist of specifications for a series of tests. Information for each test is a single line containing an integer 1 &lt;= n &lt; 1000000000 that specifies the value to process. A line containing the value 0 terminates the input.</p>

### 출력

<p>Output should consist of one line for each test comprising the test number (formatted as shown) followed by a single space and the correct British word form of the input value, with a single space between words.</p>