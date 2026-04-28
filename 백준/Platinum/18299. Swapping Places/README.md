# [Platinum I] Swapping Places - 18299

[문제 링크](https://www.acmicpc.net/problem/18299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 102, 정답: 35, 맞힌 사람: 30, 정답 비율: 36.585%

### 분류

방향 비순환 그래프, 그래프 이론, 그리디 알고리즘, 위상 정렬

### 문제 설명

<p>Animals are waiting in a line, in a quarantine zone, before they can enter a hunting-free area, where they will find an easier life.</p>

<p>When entering the quarantine zone, animals have to check in with a guard. The guard writes down the animal species, and then the animal is allowed to join the end of the line, in last position. At the other end of the line, animals have to check out: when the animal in first position in the line is finally allowed to enter the hunting-free area, another guard writes down the animal species. Thus, each guard maintains a list of animal species, written down in the chronological order in which the animals have checked in or out. A total of N animals, representing S species, have checked in (and, therefore, checked out).</p>

<p>However, animals may enter the waiting line and leave it in different orders. Indeed, some animal species are friends with each other, and thus two animals from such species, if they occupy adjacent places in the line, may accept to switch their places.</p>

<p>You have a list of those pairs of animal species that may accept to switch their places when being in adjacent positions in the line: this list contains L pairs. You were handed out the check-in list maintained by the first guard. Depending on which animals decided to switch places, several checkout lists might be possible. Among all those possible lists, which one comes first in alphabetical order?</p>

### 입력

<p>The input consists of the following lines:</p>

<ul>
	<li>Line 1 contains three space-separated integers S, L and N. S is the number of animal species, L is the number of pairs of species that are friends with each other, and N is the number of animals that entered the waiting line.</li>
	<li>Line i + 2, for 0 &le; i &lt; S, contains the name of one of the represented species: this name is made of a single word, with uppercase letters between &ldquo;A&rdquo; and &ldquo;Z&rdquo;, and contains between 1 and 20 letters.</li>
	<li>Line i + S + 2, for 0 &le; i &lt; L, contains two space-separated species names A and B describing that A and B are friends with each other.</li>
	<li>Line S + L + 2 represents the check-in list, and it contains N space-separated species names: for all 1 &le; k &le; N, the kth word is the name of the species of the animal that entered the line in kth position.</li>
</ul>

### 출력

<p>The output should contain a single line containing N words w<sub>0</sub>, . . . , w<sub>N&minus;1</sub>, separated by spaces: the list w<sub>0</sub>, . . . , w<sub>N&minus;1</sub> must be, among all the possible check-out lists, the one that comes first in alphabetical order.</p>

### 제한

<ul>
	<li>1 &le; S &le; 200;</li>
	<li>0 &le; L &le; 10 000;</li>
	<li>1 &le; N &le; 100 000.</li>
</ul>

### 힌트

<p>The six possible orderings at check-out, sorted in (increasing) alphabetical order, are:</p>

<ol>
	<li>ANT ANTILOPE CAT CAT CAT ANT</li>
	<li>ANT CAT ANTILOPE CAT CAT ANT</li>
	<li>ANT CAT CAT ANTILOPE CAT ANT</li>
	<li>ANT CAT CAT CAT ANT ANTILOPE</li>
	<li>ANT CAT CAT CAT ANTILOPE ANT</li>
	<li>ANTILOPE ANT CAT CAT CAT ANT</li>
</ol>