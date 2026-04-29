# [Gold IV] Evolving Etymology - 32893

[문제 링크](https://www.acmicpc.net/problem/32893)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 83, 맞힌 사람: 56, 정답 비율: 69.136%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>Eelco has recently started to gain interest in the field that studies the origin of words: etymology. He especially likes how words can evolve in many different ways: pronunciation changes over time, words are borrowed from different languages, and the meaning of words can change based on culture. Eelco is eager to attend the Networking With Etymologists: Revolutionary Conference for the first time ever. To make a good first impression, he is going to present a completely new method to make new words from existing words.</p>

<p>To make a new word from an existing word $s$, Eelco proposes to take every second letter of $s+s$, starting with the first letter. For example, applying this method to the word "<code>etymology</code>" would result in "<code>eyooytmlg</code>". Of course, to design even more words, this process can be repeated many times. Eelco would like to prepare a list of new words to present at the conference, so he writes a program that applies his method some predetermined number of times.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $k$ ($1 \leq n \leq 10^5$, $1 \leq k \leq 10^{18}$), the length of the original word and the number of times to apply the method.</li>
	<li>One line with a string $s$ of length $n$, only consisting of English lowercase letters (<code>a-z</code>), the original word.</li>
</ul>

### 출력

<p>Output the resulting word after applying the method to the original word $k$ times.</p>