# [Silver II] Cow Tipping - 14457

[문제 링크](https://www.acmicpc.net/problem/14457)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 769, 정답: 484, 맞힌 사람: 431, 정답 비율: 65.502%

### 분류

그리디 알고리즘

### 문제 설명

<p>Farmer John occasionally has trouble with bored teenagers who visit his farm at night and tip over his cows. One morning, he wakes up to find it has happened again -- his&nbsp;N<sup>2</sup> cows began the night grazing in a perfect&nbsp;N&times;N square grid arrangement (1 &le; N &le; 10), but he finds that some of them are now tipped over.</p>

<p>Fortunately, Farmer John has used parts from his tractor and forklift to build a glorious machine, the Cow-Untipperator 3000, that can flip over large groups of cows all at once, helping him put all his cows back on their feet as quickly as possible. He can apply the machine to any &quot;upper-left rectangle&quot; in his grid of cows -- a rectangular sub-grid that contains the upper-left cow. When he does so, the machine flips over every cow in this rectangle, placing tipped cows back on their feet, but unfortunately also tipping over cows that were already on their feet! In other words, the machine &quot;toggles&quot; the state of each cow in the rectangle.</p>

<p>Farmer John figures that by applying his machine sufficiently many times to the appropriate collection of rectangles, he can eventually restore all the cows to their rightful, un-tipped states. Please help him determine the minimum number of applications of his machine needed to do this.</p>

<p>Note that applying the machine to the same rectangle twice would be pointless, since this would have no net impact on the cows in the rectangle. Therefore, you should only consider applying the machine to each upper-left rectangle possibly only once.</p>

### 입력

<p>The first line of the input is the integer&nbsp;N.</p>

<p>Each of the&nbsp;N&nbsp;subsequent lines contains a string of&nbsp;N&nbsp;characters, each either 0 (representing an up-tipped cow) or 1 (representing a tipped cow).</p>

### 출력

<p>Please output the minimum number of times Farmer John needs to apply the Cow-Untipperator 3000 to restore all his cows to their feet.</p>

### 힌트

<p>In this example, if FJ applies his machine to the entire herd of cows (which is a valid upper-left rectangle), he will toggle their state to the following:</p>

<pre>
110
000
000
</pre>

<p>All that remains is to apply the machine to the upper-left rectangle containing the two 1s, and he is finished. In total, this is just 2 applications.</p>

<p>&nbsp;</p>