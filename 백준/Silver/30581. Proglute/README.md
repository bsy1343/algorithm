# [Silver II] Proglute - 30581

[문제 링크](https://www.acmicpc.net/problem/30581)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 28, 맞힌 사람: 23, 정답 비율: 74.194%

### 분류

수학, 정수론

### 문제 설명

<p>Baroque opera geeks in Tomorrow Programming School are developing a new string instrument suitable for their innovative performances. The instrument, named programmed lute, or proglute in short, consists of flat circular body, with N pegs situated on the body perimeter, and labeled by integers from 1 to N.</p>

<p>Each string on the instrument is stretched between two different pegs and runs across the proglute&rsquo;s body without crossing other strings. To enhance complex resonance effects, the developers decided to attach two strings to all but two pegs, called principal pegs. Only one string is attached to each principal peg. To support glissando effects, the strings are arranged in such way that it is possible for a musician to touch the string at one principal peg and then slide the finger along all strings on the instrument to the other principal peg. While sliding, musician does not remove the finger from a string, and skips from a string to another one only at their common end peg.</p>

<p>To build the instrument, there are many ways to arrange the strings on the proglute. Different arrangement would result in different musical properties of the instrument. The developers want to know the number of all possible arrangements of strings on the proglute. They introduced the following notions.</p>

<ul>
	<li>The characteristic of a string is an unordered pair of labels of pegs at the string ends.</li>
	<li>The characteristic of a proglute is the set of all its string characteristics.</li>
	<li>Two strings arrangements on proglute are considered to be different when their corresponding characteristics are different.</li>
</ul>

<p>Calculate the number of different string arrangements on the proglute.</p>

<p>The figure below shows two possible solutions for a proglute with five pegs:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30581.%E2%80%85Proglute/eda3ebe6.png" data-original-src="https://upload.acmicpc.net/335fff12-e23d-4b06-b05b-6cba430af174/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 238px; height: 111px;" /></p>

### 입력

<p>The input consists of single line with an integer N (2 &le; N &le; 1000), the number of the pegs on the proglute perimeter.</p>

### 출력

<p>Output a single number equal to the number of mutually different arrangements of the strings on the proglute mod 10<sup>9</sup> + 7.</p>