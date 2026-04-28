# [Silver II] Travel of alphabets - 11259

[문제 링크](https://www.acmicpc.net/problem/11259)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 47, 정답: 36, 맞힌 사람: 32, 정답 비율: 74.419%

### 분류

그래프 이론, 자료 구조, 브루트포스 알고리즘, 그래프 탐색, 정렬, 집합과 맵, 너비 우선 탐색, 깊이 우선 탐색, 해시를 사용한 집합과 맵, 재귀

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11259/1.png" style="float:left; height:174px; width:267px" />John Corner demands to generate words from his alphabet table. Each word is composed by traveling of alphabets in four directions (&larr; le*, &uarr; up, &rarr; right, and &darr; down), star/ng from first alphabet (&lsquo;i&rsquo;) un/l last alphabet (&lsquo;r&rsquo;). When all words have been created, he would like to know how many words he has. Of course, it is possible to have some duplicated words and he also needs to know how many unique words he got. Please help him to finish these funny tasks.</p>

<p><strong>Moving step explanation:</strong></p>

<p>From the Figure above presented alphabet table that has the 3 row x 4 column.</p>

<p>Case: word length = 1,</p>

<p>Regarding to the alphabet table, take each alphabet starting from &lsquo;i&rsquo; (top-left) to &lsquo;r&rsquo; (rightdown), then there are 12 result words (i c p c h i j k a c m r). Length =1, one alphabet means one word. In this case, there is no traveling in four directions (&larr; &uarr; &rarr; &darr;) since the word is ended by the length (length = 1).</p>

<p>Case: word length = 2,</p>

<p>Take &lsquo;i&rsquo; (top-left corner) from the alphabet table. &lsquo;i&rsquo; cannot move left or up since there is no adjacent alphabets. &lsquo;i&rsquo; can only move right and move down. Then, let move &lsquo;i&#39; to the right, the word will be &ldquo;ic&rdquo;. Let move &lsquo;i&rsquo; down, the word will be &ldquo;ih&rdquo;.</p>

<p>Next step, take another adjacent alphabet &lsquo;c&rsquo;. &lsquo;c&rsquo; can move in ordered left, right and down. The words will be &ldquo;ci, cp, ci&rdquo;. He repeats these steps until reaching the last alphabet (&lsquo;r&rsquo;).</p>

<p>Case: word length = 3,</p>

<p>Use the previous travel steps. Thus, let move &lsquo;i&rsquo; to the right, the word will be &ldquo;ic&rdquo;. (length = 2).</p>

<p>Then, continue to move for the word with length = 3</p>

<ul>
	<li>move left (from &lsquo;c&rsquo;) to the last alphabet back to itself. &ldquo;ic&rdquo; -&gt; &lsquo;i&rsquo;.</li>
	<li>CANNOT move up. (There is no an adjacent alphabet above)</li>
	<li>move right (from &lsquo;c&rsquo;) &ldquo;ic&rdquo; -&gt; &lsquo;p&rsquo;</li>
	<li>move down (from &lsquo;c&rsquo;) &ldquo;ic&rdquo; -&gt; &lsquo;i&rsquo;</li>
</ul>

<p>Then, all summarized words starting from the first alphabet will be &ldquo;ici&rdquo;, &ldquo;icp&rdquo;, &ldquo;ici&rdquo;, &hellip;. , then, repeat until reaching the last alphabet (&lsquo;r&rsquo;)</p>

<p><strong>Alphabet traveling restriction:</strong></p>

<p>John has been participated ACM ICPC Thailand and he loves it very much. Therefore, he prefers to define &ldquo;<span style="color:#FF0000">acm</span>&rdquo; as <strong>THREE</strong> forbidden alphabets. Any word contains any forbidden alphabets (&lsquo;a&rsquo; OR &lsquo;c&rsquo; OR &lsquo;m&rsquo; <em><strong>LOWERCASE only</strong></em>) will be discarded (examples: i<span style="color:#FF0000"><u>c</u></span>i, <span style="color:#FF0000"><u>a</u></span>hi, and <span style="color:#FF0000"><u>m</u></span>rk will be rejected)&nbsp;</p>

<p><strong>Remark:</strong> When he moves an alphabet to another alphabet, it can be moved back to a previous selected alphabet if it still satisfies the policy (moving four directions, word lengths and forbidden alphabets).</p>

<p>Since John applies the moving steps including his traveling restriction, the generated words will be minor changed as illustrated in these 3 examples:&nbsp;</p>

### 입력

<p>The first line of input contains three unsigned integers: the row &ldquo;R&rdquo; (0 &lt; R &lt; 11), the column &ldquo;C&rdquo; (0 &lt; C &lt; 11) of the alphabet table and the word length &ldquo;L&rdquo; (0 &lt; L &lt; 7) consecutively.</p>

<p>The following R lines represent the alphabet table. Each line is a row containing C characters without space. All given characters are smaller letters.&nbsp;</p>

### 출력

<p>The first line is an integer calculated from the number of generated words with the length of L, and the second line is an integer calculated from the number of unique words of all words generated.&nbsp;</p>

### 힌트

<p><strong>Example 1</strong></p>

<p>The result words (length=1):</p>

<pre>
b c
d e f
h i j</pre>

<p>All words = 7 (&lsquo;a&rsquo; does not count as a forbidden alphabet) and unique words = 7 (no duplication).</p>

<p><strong>Example 2</strong></p>

<p>The result words (length=2):</p>

<pre>
ih pj
hi hi ih ij ji jp jk kj kr
rk</pre>

<p>All words = 12 and unique words = 10 (&ldquo;hi&rdquo;: 2 duplicated words and &ldquo;ih&rdquo;: 2 duplicated words)&nbsp;</p>

<p><strong>Example 3</strong></p>

<p>The result words (length=3):</p>

<pre>
bob box boo btb btb bto bti obo obt oxo
oxy oot ooo ooy oot xob xox xoo xyo xyx
btb btb bto bti bgb bgi tbt tbg tbo tbt
tot too toy tot tig tit tit tie otb otb
oto oti oob oox ooo oyo oyx oti oto otu
yot yoo yoy yot yxo yxy
gbt gbg gig git git gie igb igi itb itb
ito iti iti ito itu iei ieu tig tit tit
tie tot too toy tot tue tut tui
eig eit eit eie eue eut eui uei ueu uti
uto utu uiu iue iut iui</pre>

<p>All words = 100 and unique words = 73.&nbsp;</p>