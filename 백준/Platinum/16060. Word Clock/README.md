# [Platinum IV] Word Clock - 16060

[문제 링크](https://www.acmicpc.net/problem/16060)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 13, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You work at a company producing word clocks. These are clocks which, instead of an ordinary clock face, have a grid of letters that is used to display time. Inside the clock are LEDs, one behind each letter, which are lit up in such a way that the illuminated letters spell out the current time as a sentence. See the example below:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16060.%E2%80%85Word%E2%80%85Clock/1b45f43f.png" data-original-src="https://upload.acmicpc.net/f1a658aa-10ca-4db2-b8f3-e0e9a1cf11de/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 216px; height: 203px;" /></p>

<p style="text-align: center;">Figure J.1: Example word clock displaying the time 3:15. Note that for efficiency reasons, words are allowed to overlap, e.g. FIVE and EIGHT.</p>

<p>Recently your company decided to go international, and you have been tasked with designing the clock faces for various languages. For this purpose, the team of translators has already compiled a list of all the words needed to tell the time and arranged them into groups according to their position in the sentence (e.g. in the above example the numbers from ONE to TWELVE form such a group, as do the words PAST and TO). This means that you won&rsquo;t have to worry about grammar, as you will only consider a single group at a time.</p>

<p>Given such a group of words and the size of a subgrid, find a way to place all words in the grid or determine that this is impossible. Words have to be written from left to right and are not allowed to wrap from one line to another.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with three integers h, w, n, where
	<ul>
		<li>h (1 &le; h &le; 18) is the height of the grid;</li>
		<li>w (1 &le; w &le; 18) is the width of the grid;</li>
		<li>n (1 &le; n &le; 18) is the number of words.</li>
	</ul>
	</li>
	<li>one line with n words, the words to fit inside the grid. Each word consists of at least 1 and at most 18 uppercase letters of the English alphabet. The words are distinct.</li>
</ul>

### 출력

<p>If there is no solution, print impossible. Otherwise print h lines, each with w uppercase letters, the grid of the word clock. If there is more than one solution, any will be accepted.</p>