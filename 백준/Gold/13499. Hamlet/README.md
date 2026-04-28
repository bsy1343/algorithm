# [Gold V] Hamlet - 13499

[문제 링크](https://www.acmicpc.net/problem/13499)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 53, 정답: 13, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Imagine that you are returning home from your first year at USC, to find that your father has died and your evil uncle (his brother) has married your mother. And soon after, your father&rsquo;s ghost appears and tells you that your uncle actually murdered him. Oh, and in addition, you are the prince of Denmark, and your evil uncle is now the new king. That&rsquo;s the start of the play Hamlet. Not surprisingly, Hamlet is a little upset at this, and thinks things through in his famous&nbsp;soliloquy:</p>

<blockquote>
<p>To be, or not to be &mdash; that is the question:<br />
Whether &rsquo;tis nobler in the mind to suffer<br />
The slings and arrows of outrageous fortune<br />
Or to take arms against a sea of troubles<br />
And by opposing end them. [...]</p>
</blockquote>

<p>Hamlet is thinking about possible courses of action, notably including suicide; he notes that there is a lot of uncertainty&nbsp;about the outcome, e.g., whether he would enjoy deep sleep (good outcome), or be tormented by horrible &ldquo;dreams&rdquo; in&nbsp;death (bad outcome). Similarly, at a later stage, Hamlet hears noise behind the curtain while talking to his mother. He&nbsp;stabs at the curtain, despite the uncertainty of who is there. Had it been his evil uncle, things could have ended pretty&nbsp;well; instead, it was the father of the woman he loves, who then proceeds to drown (in madness or suicide), a rather bad&nbsp;outcome. The problem is that Hamlet (like the rest of us) has to take lots of actions whose outcomes are uncertain. You&nbsp;are to help him optimize his choices, and thereby prevent an ending where everyone in the House of Denmark dies.</p>

<p>Specifically, you will be given a number of states that the plot (or Hamlet&rsquo;s life) could be in, such as &ldquo;beginning&rdquo; or&nbsp;&ldquo;Hamlet has chosen to kill himself and sleeps peacefully&rdquo; or &ldquo;Hamlet has chosen to kill himself and is tormented in hell&rdquo;&nbsp;or &ldquo;Hamlet has stabbed his uncle Claudius&rdquo; or &ldquo;Hamlet has stabbed Polonius and Ophelia has drowned.&rdquo; A state can be&nbsp;the end of the story, in which case there is a value the state has. Otherwise, Hamlet has one or more actions available, and&nbsp;for each action, there is a distribution over other states that could result from this action. For instance, if Hamlet stabs the&nbsp;person behind the curtain, it may be Claudius with probability 40%, Polonius with probability 50%, and a random servant&nbsp;with probability 10%, leading to three corresponding new plot states. To keep this manageable, we assume that there can&nbsp;never be a cycle in the plot states. This will be enforced by numbering the plot states from 1 to n, and guaranteeing that&nbsp;for all actions, the probability of going from a higher to a lower or equal state is always 0.</p>

<p>As an example, suppose that Hamlet can choose whether or not to stab the curtain. If Claudius is behind the curtain, then&nbsp;the plot ends and Hamlet gets value +3. If a random servant is behind the curtain, the plot ends and Hamlet gets value -1.&nbsp;If Polonius is behind the curtain, then Ophelia will drown, and Laertes will challenge Hamlet to a fencing match, secretly&nbsp;poisoning his sword. If Hamlet accepts, they will both die, and the value is -10. If Hamlet rejects, then they may still&nbsp;both die because of poisoned wine (with probability 50%), or they both live, but Polonius and Ophelia are dead, giving&nbsp;value -5. Then, the value of stabbing the curtain is 40% &middot; 3 + 10% &middot; &minus;1 + 50% &middot;(50% &middot; &minus;10 + 50% &middot; &minus;5) = &minus;2.65. (Because if&nbsp;it turns out to be Polonius behind the curtain, Hamlet is better off rejecting Laertes&rsquo;s challenge.) After calculating this,&nbsp;we could compare it to the value of not stabbing the curtain, which would follow a similar calculation.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets&nbsp;of the following form:</p>

<p>The first line of the data set contains one integer n with 1 &le; n &le; 1000, the number of plot states.</p>

<p>This is followed by n descriptions of plot points, as follows. For each plot point 1 &le; i &le; n, the first line is an integer&nbsp;0 &le; a<sub>i</sub> &le; 5. This is the number of actions Hamlet can choose from in state i. If a<sub>i</sub> = 0, then the next line contains a&nbsp;double v<sub>i</sub> &isin; [&minus;1000, 1000], which is the value of the final outcome i. If a<sub>i</sub> &gt; 0, then there are a<sub>i</sub> more lines, each line k&nbsp;containing n doubles p<sup>(k)</sup><sub>i,j</sub> &isin; [0, 1], such that<samp><span style="font-family:arial,helvetica,sans-serif"><span style="font-size:12px"> <span style="color:rgb(34, 34, 34)">&Sigma;<sub>j</sub></span></span></span></samp>p<sup>(k)</sup><sub>i,j</sub> = 1. These are the probabilitiesb&nbsp;of moving from state i to state j by&nbsp;taking action k in state i. We will guarantee that p<sup>(k)</sup><sub>i,j</sub> = 0 whenever i &ge; j</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum&nbsp;expected value Hamlet can guarantee himself with a best possible strategy, rounded to two decimals.</p>

<p>Each data set should be followed by a blank line.</p>