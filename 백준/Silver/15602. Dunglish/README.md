# [Silver III] Dunglish - 15602

[문제 링크](https://www.acmicpc.net/problem/15602)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 66, 맞힌 사람: 57, 정답 비율: 59.375%

### 분류

조합론, 자료 구조, 해시를 사용한 집합과 맵, 구현, 수학, 집합과 맵

### 문제 설명

<p>A confused Dutchman trying to speak English could say &ldquo;I am in the war&rdquo;, even though there is no hostile activity going on. The confusion<sup>1</sup> here is that the English sentence &ldquo;I am confused&rdquo; is translated in Dutch as &ldquo;Ik ben in de war&rdquo;, which is phonetically (&ldquo;sounding&rdquo;) quite close to the first sentence. Such confusion leads to much enjoyment, but can complicate matters a bit.</p>

<p>Given a sentence in Dutch and a dictionary containing both correct translations as well as phonetic (incorrect) translations of individual words, find the translation of the sentence and indicate whether it is correct, or in case there is more than one find the total number of correct and incorrect translations. A sentence is correctly translated when each word of the sentence is correctly translated.</p>

<p><sup>1</sup>Pun intended.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer n (1 &le; n &le; 20), the number of words in the Dutch sentence.</li>
	<li>One line with n words, the Dutch sentence s.</li>
	<li>One line with an integer m (1 &le; m &le; 10<sup>5</sup>), the number of words in the dictionary.</li>
	<li>m lines, each with three strings d, e and c, a Dutch word, the English translation, and &ldquo;correct&rdquo; if this is the correct translation or &ldquo;incorrect&rdquo; otherwise.</li>
</ul>

<p>A word consists of between 1 and 20 lowercase letters. Each word in s appears at least once as a Dutch word in the dictionary, no word appears more than 8 times as a Dutch word in the dictionary, and each combination of a Dutch and English word appears at most once.</p>

### 출력

<p>In case there is only a single translation of s, output one line with the translation followed by one line with &ldquo;correct&rdquo; or &ldquo;incorrect&rdquo;. In case there is more than one translation, output one line with the number of possible correct translations followed by &ldquo;correct&rdquo;, and one line with the number of possible incorrect translations followed by &ldquo;incorrect&rdquo;.</p>