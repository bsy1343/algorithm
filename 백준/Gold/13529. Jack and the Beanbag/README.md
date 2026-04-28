# [Gold III] Jack and the Beanbag - 13529

[문제 링크](https://www.acmicpc.net/problem/13529)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 28, 정답: 21, 맞힌 사람: 20, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘, 비트마스킹, 백트래킹

### 문제 설명

<p>Jack, na&iuml;ve fellow that he is, has fallen into the clutches of a dastardly and sophisticated&nbsp;multi-level marketing scheme.</p>

<p>It all started when a mysterious stranger pushed upon young Jack a bag of ordinary beans,&nbsp;promising that if only he could amass the right quantities of each kind of bean, he could grow a&nbsp;mighty beanstalk and climb it to the unimaginable wealth at its top.</p>

<p>This all sounds very sensible to Jack... But there is one catch. He must acquire the extra beans&nbsp;from other farmers, who as one might expect are not too keen to give away the fruits (nor the&nbsp;seeds) of their labour. Each time Jack comes to ask for a bean, they will give him exactly one&nbsp;from their farm, but since he is not a paying customer the exact species may vary between&nbsp;farmers and between visits.</p>

<p>There is another option, but it is expensive. Jack can give up some of his cows to the mysterious&nbsp;stranger in exchange for one additional bean per cow. Of course, this is a drastic measure. We&nbsp;would like to help Jack keep as many of his cows as possible, while still achieving his goals.</p>

<p>How many cows will Jack need to budget for to have 100% certainty of success?</p>

### 입력

<ul>
	<li>One line containing an integer B, (1 &le; B &le; 20), the number of types of beans available.</li>
	<li>One line containing B integers, V<sub>1</sub> . . . V<sub>B</sub>, (0 &le; V<sub>1 </sub>. . . V<sub>B</sub> &le; 100), the number of each&nbsp;kind of bean required.</li>
	<li>One line containing T (1 &le; T &le; 100), the number of other farms in Jack&rsquo;s small village.</li>
	<li>T more lines, each beginning with an integer M (1 &le; M &le; B) giving the number of&nbsp;kinds of bean this farmer grows. This is followed by M more distinct integers T<sub>1</sub> . . . T<sub>M</sub>&nbsp;(1 &le; T<sub>1</sub> . . . T<sub>M</sub> &le; B), each corresponding to one kind of bean.</li>
</ul>

### 출력

<ul>
	<li>One line containing one integer: the number of cows Jack must bring with him in order to&nbsp;be 100% sure of ending the day with enough beans to grow a magical beanstalk.</li>
</ul>