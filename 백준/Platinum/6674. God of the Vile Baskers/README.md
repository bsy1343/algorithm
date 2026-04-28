# [Platinum V] God of the Vile Baskers - 6674

[문제 링크](https://www.acmicpc.net/problem/6674)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 3, 정답 비율: 30.000%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 해싱, 슬라이딩 윈도우

### 문제 설명

<p>A not very famous writer Arthur Conan Moyle has finally found out why his books are not as popular as he believes they would deserve. He noticed that his works are getting a bit boring due to frequent repetitions of same or similar pieces of text. He decided that the best way how to improve the quality of his books is to simply throw away everything after the first repetition - the books then get an interesting open-ended feeling.</p>

<p>First he attempted to look for exactly same pieces of text, but this failed, since the repeated texts often do not match precisely - some of letters that are lowercase in the first place may be uppercase in the second and vice versa, punctuation may be a bit different, and even the words in sentences may be in slightly different order. To overcome these problems, he devised the following more involved criterion for recognizing duplicates (a positive integer k is a parameter of his criterion; by changing it he affects how long repeated pieces are still acceptable):</p>

<p>Alphabetic characters are the letters &#39;a&#39;-&#39;z&#39; and &#39;A&#39;-&#39;Z&#39;. We do not distinguish case of the letters, i.e. &#39;a&#39; is supposed to be the same letter as &#39;A&#39;.</p>

<p>Two strings S1 and S2 are k-identical up to permutation of letters if:</p>

<ul>
	<li>Both S1 and S2 start and end with an alphabetic character</li>
	<li>Both S1 and S2 contain exactly k alphabetic characters</li>
	<li>For each alphabetic character c, the string S1 contains the same number of occurrences of c as the string S2.</li>
</ul>

<p>In other words, if the strings S1 and S2 are k-identical up to permutation of letters, then the alphabetic characters in them are the same, but their ordering may be different.</p>

<p>Your task is to write a program that separates a longest initial part that does not contain two substrings k-identical up to permutation of letters from several of the ACM&#39;s books.</p>

### 입력

<p>The input consists of several instances. Each instance is described by two lines.</p>

<p>The first line of the instance consists of an integer number 1 &lt;= k &lt;= 50. The second line of the instance consists of the string T. Length of T is at most 100 000 characters. The string T may contain non-alphabetic characters including spaces, but it does not contain any characters with special meaning (i.e. with ASCII code smaller than 32).</p>

<p>The input is terminated by a line containing a zero.</p>

### 출력

<p>The output consists of several lines. The i-th line of the output corresponds to the i-th input instance. The line a single integer number - length of the longest prefix P (including all non-alphabetic characters) of the string T of the corresponding instance such that P does not contain two distinct, but not necessarily non-overlapping, substrings S1 and S2 that are k-identical up to permutation of letters.</p>

<p>&nbsp;</p>