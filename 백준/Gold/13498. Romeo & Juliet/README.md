# [Gold III] Romeo & Juliet - 13498

[문제 링크](https://www.acmicpc.net/problem/13498)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

그래프 이론, 정렬, 최단 경로, 플로이드–워셜

### 문제 설명

<p>Depending on your viewpoint, Romeo &amp; Juliet might be either the most romantic story of pure love thwarted by the&nbsp;tragic backstory of two families (Montagues and Capulets) who hate each other, or the story of a young daredevil playboy&nbsp;who gets a kick out of going after the innocent 13-year old daughter of a rival family, and with his stubbornness and poor&nbsp;judgment leads to both of their deaths.</p>

<p>One of the most iconic scenes in Romeo &amp; Juliet is the so-called &ldquo;Balcony Scene,&rdquo; in which Juliet stands on her balcony&nbsp;and reflects on their relationship, while Romeo is still hiding in the bushes. She speaks the famous words &ldquo;O Romeo,&nbsp;Romeo! Wherefore art thou Romeo?&rdquo;. While she goes on to talk about how a name is only a name, a lot of the true&nbsp;meaning of her reflections is that his name and family association bring a whole history of guilt, making their relationship&nbsp;impossible or extremely fraught. So, as much as she might wish that he had a different name, or were a different person,&nbsp;she also wishes that the past had been different.</p>

<p>In this question, you will explore which changes to past history would help their relationship the most. A lot of the&nbsp;problems here and in other long-standing feuds arise from guilt by association: by being the son or aunt or friend of&nbsp;someone who did something terrible to your mother or cousin, the person automatically acquires guilt towards you. We&nbsp;will model this with &ldquo;actions&rdquo; and &ldquo;relationships,&rdquo; as follows.</p>

<ul>
	<li>An action is when person A did something bad to person B, and it comes with a cost. For instance, if A murdered B,&nbsp;that might have a cost of 100, if A cheated B in a business deal, it has a cost of 5, and if A messed up B&rsquo;s computer&nbsp;right before a CS104 deadline, the cost is 1000. You will be given a list of all actions that happened in the past,&nbsp;who was involved, and what the cost was.</li>
	<li>A relationship between two people means that A inherits (part of) B&rsquo;s guilt. Each relationship has associated with&nbsp;it a number between 0 and 1, the percentage of guilt/pain transferred from A to B via association. (The percentage&nbsp;from A to B may be different from the one from B to A.) Guilt can be transferred along chains of more than one&nbsp;person. For instance, if A is friends with B and B is friends with C, and each friendship transfers 50% of guilt, then&nbsp;C inherits 25% of A&rsquo;s guilt. However, if A and C have another friend D in common, then C&rsquo;s guilt is still only 25%&nbsp;&mdash; we only count one chain that gives maximum guilt transfer.</li>
</ul>

<p>As an example, Juliet&rsquo;s cousin Tybalt kills Romeo&rsquo;s good friend Mercutio, and suppose that Juliet&rsquo;s father also cheated&nbsp;Romeo&rsquo;s father in a business deal. Let&rsquo;s say that &ldquo;cousin&rdquo; counts as 0.4 (both directions), good friend as 0.8 (both&nbsp;directions), father as 0.85 and son/daughter as 0.9. Killing is 100 and business cheating is 5. Then, Juliet&rsquo;s total guilt to&nbsp;Romeo is 0.4 &middot; 0.8 &middot; 100 + 0.9 &middot; 0.9 &middot; 5 = 36.05. If she could change history and make Tybalt not kill Mercutio, then her&nbsp;guilt would only be 4.05. Even if we take into account that Mercutio is also friends with Benvolio, who is also friends&nbsp;with Romeo, we don&rsquo;t add an extra 0.4 &middot; 0.8 &middot; 0.8 &middot; 100 guilt, since we only count one way in which the murder guilt gets&nbsp;transferred.</p>

<p>You will be given the number of events in history that Juliet can erase, and are to calculate what is the smallest guilt&nbsp;that Juliet can accomplish from her to Romeo by deleting at most the given number of events.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of the data set contains four integers n, r, m, k. 2 &le; n &le; 100 is the number of people in the drama. Person1 is always Juliet and Person 2 is always Romeo. 0 &le; r &le; n<sup>2</sup>&nbsp;is the number of relationships, and 0 &le; m &le; 10000 is the&nbsp;number of bad events in history. Finally 0 &le; k &le; m is the number of events Juliet gets to erase from history.</p>

<p>This is followed by r lines, each of the form u<sub>i</sub>, v<sub>i</sub>, p<sub>i</sub>. 1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n are the two people involved in the ith relationship,&nbsp;and p<sub>i</sub> &isin; [0, 1] is the guilt (or pain) transferred from u<sub>i</sub> to v<sub>i</sub>. Specifically, if u<sub>i</sub> did something to someone, then v<sub>i</sub> will&nbsp;inherit a p<sub>i</sub> fraction of u<sub>i</sub>&rsquo;s guilt, and if something was done to u<sub>i</sub>, then v<sub>i</sub> will inherit a p<sub>i</sub> fraction of u<sub>i</sub>&rsquo;s &ldquo;pain.&rdquo; The&nbsp;list will never contain the same pair (u<sub>i</sub>, v<sub>i</sub>) twice, but can contain both (u<sub>i</sub>, v<sub>i</sub>) and (v<sub>i</sub>, u<sub>i</sub>), as guilt transfer may not be&nbsp;symmetric.</p>

<p>Finally, there are m lines, describing the bad events. Each line is of the form u<sub>i</sub>, v<sub>i</sub>, d<sub>i</sub>, where again 1 &le; u<sub>i</sub>, v<sub>i</sub> &le; n are the&nbsp;two people involved in the ith bad event, and the double 0 &le; d<sub>i</sub> &le; 10<sup>4</sup>&nbsp;is the damage that u<sub>i</sub> did to v<sub>i</sub>. Here, it is possible&nbsp;that the same pair (u<sub>i</sub>, v<sub>i</sub>) appears multiple times.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the minimum guilt from&nbsp;herself to Romeo that Juliet can achieve by erasing at most k events from history, rounded to two decimals.</p>

<p>Each data set should be followed by a blank line.</p>