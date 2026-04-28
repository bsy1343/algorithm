# [Platinum IV] Sum of Palindromes - 18726

[문제 링크](https://www.acmicpc.net/problem/18726)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 149, 정답: 40, 맞힌 사람: 36, 정답 비율: 27.907%

### 분류

수학, 구현, 그리디 알고리즘, 문자열, 애드 혹, 해 구성하기, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>For a 7-years-old you, a day would not be complete without a fight with your little sister. Today&rsquo;s fight is about palindromes: she has recently become very passionate about the topic, while you think this is an exceptionally stupid choice of topic to be passionate about. Obviously, you couldn&rsquo;t have missed a chance to express this opinion out loud.</p>

<p>&ldquo;Palindromes are awesome, you ignorant&rdquo;, she shouts, &ldquo;for example you can add palindromes and the result will always remain a palindrome! Like 242 + 515 = 767 ! Or 111 + 222 + 333 = 666. See, stupid?&rdquo;</p>

<p>There it is! You could easily end this pointless conversation by showing her some palindromes which sum to a non-palindrome, but it would be too simple, too easy... You don&rsquo;t want to win with her, you want to humiliate her. So instead you ask her to produce a number, any number, and you&rsquo;d show her that it is actually a sum of just a few palindromes. Let&rsquo;s say, no more than 25 palindromes: you would absolutely hate it if you needed to add up so many palindromes that she lost interest before you finished the summation.</p>

<p>Clearly, you&rsquo;ve underestimated your enemy. You sit by your desk and you look at your number... 100 000 digits long...</p>

### 입력

<p>The first line of input contains the number of test cases z (1 &le; z &le; 20 000). The descriptions of the test cases follow.</p>

<p>A test case consists of a single line, containing a positive integer with at most 100 000 decimal digits.</p>

<p>The total number of digits in all numbers does not exceed 3 000 000.</p>

### 출력

<p>For each test case, first output a line containing the number of palindromes k, which should be between 1 and 25 inclusive. Next, k lines should follow, each containing a positive integer being also a palindrome. Leading zeroes are not allowed (and thus, for example, 3630 is not a palindrome). The sum of all the numbers should equal the input integer.</p>