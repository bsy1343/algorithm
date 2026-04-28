# [Silver III] Knjige - 20507

[문제 링크](https://www.acmicpc.net/problem/20507)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 63, 정답: 32, 맞힌 사람: 24, 정답 비율: 44.444%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Tin is a very special boy. He doesn&rsquo;t like a lot of things, for example he doesn&rsquo;t like Barcelona, getting defeated in video games or any sort of mess...</p>

<p>Today he is visiting his friend Ante to once and for all decide who is the best FIFA player. The moment he entered Ante&rsquo;s apartment, he was greeted with an unpleasant surprise. Ante has two shelves on his wall side by side. The left one contains n books about the numerous accomplishments of Barcelona <strong>stacked on top of each other</strong>, and the right one is empty.</p>

<p>He didn&rsquo;t mind so much that Ante was reading, in his opinion, trashy books, but what bothered him much more was that the books were a total mess, that is, they weren&rsquo;t sorted from thinnest to thickest. As Ante is a good friend, he immediately hurried to rearrange the books to Tin&rsquo;s liking. In one move he can:</p>

<ul>
	<li><strong>take a book from the top</strong> of some shelf in his left or right hand, if he is not holding some other book in that hand; or</li>
	<li><strong>put the book</strong> he is holding in some hand <strong>on top</strong> of some shelf.</li>
</ul>

<p>Ante&rsquo;s strong suit is football, not rearranging books, so he asks you to find some sequence of moves, that he will then perform, so that in the end all books will be on the <strong>left shelf</strong> and sorted <strong>from thinnest to thickest</strong>, in the order <strong>from top to bottom</strong>.</p>

### 입력

<p>The first line contains an integer n (1 &le; n &le; 100), the number of books on the left shelf.</p>

<p>The second line contains n integers d<sub>i</sub> (1 &le; d<sub>i</sub> &le; 1000) that represent the thicknesses of the books, from top to bottom.</p>

### 출력

<p>In the first line output an integer k (0 &le; k &le; 100 000), the number of moves in your solution.</p>

<p>In the following k lines output the moves in the form INSTRUCTION HAND SHELF, where:</p>

<ul>
	<li><code>INSTRUCTION</code> is the word <code>UZMI</code> (Croatian for take) if Ante should take a book from some shelf, or the word <code>STAVI</code> (Croatian for put) if he should put a book on some shelf</li>
	<li><code>HAND</code> is the letter <code>L</code> if Ante should use his left hand, or the letter <code>D</code> (Croatian word for right is desno) if he should use his right hand</li>
	<li><code>SHELF</code> is the letter <code>L</code> if this move acts on the left shelf, or the letter <code>D</code> if it acts on the right shelf.</li>
</ul>

<p>Your solution does <strong>not</strong> have to be of minimum possible length, but the number of moves must not exceed 100 000. It can be proven that for the given constraints a solution always exists.</p>

### 힌트

<p>Clarification of the first example:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/92fe4bca-ee80-41da-a4fd-9d485ced4065/-/preview/" style="width: 515px; height: 540px;" /></p>