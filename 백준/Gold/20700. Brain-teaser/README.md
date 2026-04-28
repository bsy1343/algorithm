# [Gold III] Brain-teaser - 20700

[문제 링크](https://www.acmicpc.net/problem/20700)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

(분류 없음)

### 문제 설명

<p>There is a type of a brain-teaser known as <em>cryptoarithmetics</em>. The classic example, published in the July 1924 issue of Strand Magazine by Henry Dudeney, is:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20700.%E2%80%85Brain-teaser/b2dc24b9.png" data-original-src="https://upload.acmicpc.net/5b835379-e823-4792-9129-bd2683e56bb5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 153px; height: 62px;" /></p>

<p>A solution to such a puzzle is an assignment of letters to decimal digits from 0 to 9 that satisfies the following constraints:</p>

<ul>
	<li>Each letter must represent a different decimal digit.</li>
	<li>The leading digit of each number must not be zero.</li>
	<li>The result must be a correct equality --- the sum of the first two decimal numbers is equal to the third one.</li>
</ul>

<p>The only solution to the above puzzle is $\tt{O} = 0$, $\tt{M} = 1$, $\tt{Y} = 2$, $\tt{E} = 5$, &nbsp;$\tt{N} = 6$, $\tt{D} = 7$, $\tt{R} = 8$, and $\tt{S} = 9$, producing the following equality: $9567 + 1085 = 10652$.</p>

<p>A <em>good</em> brain-teaser, like the classic one, has a unique solution. You are given the first two words in a brain-teaser and your task is to find all the possible third words from the given dictionary that produce a good brain-teaser with a unique solution.</p>

### 입력

<p>The first and the second lines of the input contain a word each --- two addends of the brain-teaser. The third line of the input contains an integer $n$ --- the number of words in the dictionary, followed by $n$ lines with the dictionary words. The words in the dictionary are lexicographically ordered.</p>

<p>All words in the input consist of 2 to 15 uppercase letters. All the tests, with the exception of the first test, use the same dictionary of $279\,496$ Collins Dictionary Scrabble Words (2019). The first two words come from this dictionary, too. Note that you can find the second test with the full dictionary inside the downloadable file with the problem examples. It is provided together with the problem statements.</p>

### 출력

<p>On the first line output a single integer $m$ --- the number of words from the dictionary that produce a good brain-teaser with the first two given words. On the next $m$ lines output the words in the same order as in the dictionary.</p>