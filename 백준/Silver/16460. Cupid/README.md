# [Silver IV] Cupid - 16460

[문제 링크](https://www.acmicpc.net/problem/16460)

### 성능 요약

시간 제한: 1.004 초, 메모리 제한: 512 MB

### 통계

제출: 578, 정답: 256, 맞힌 사람: 216, 정답 비율: 44.536%

### 분류

구현, 문자열, 정렬

### 문제 설명

<p>Since 1969, the Internet has upended all kind of industries - retailing, politics, entertainment, etc. Among them may its most profound repercussion well be&mdash;on how we choose a mate.</p>

<p>At the stage of its emergence, the notion of meeting someone via online seemed pathetic and freakish. However, now, it becomes a necessity for someone, especially who are coping with social or geographical constraints. In the United States, 70% of gay people meet their partner online. Other evidence also suggests that it contributes to breaking down homogeneous groups by boosting interracial and international marriage.</p>

<p>On the other hand, service providers are also coping with an inherent conflict of interests: the better matching for users, the fewer people left in the service. Thus, to keep a sustainable business model, the firms decided to provide premium services, such as &quot;see who Liked me&quot;. With this,&nbsp;you can save a lot of time for answering yes or no for candidates who would not finally Like you, hence &quot;not a match&quot;.</p>

<p>Now you only have to set your gender preference and maximum geographical distance. <em>(No long-distance relationship in the beginning!)</em>&nbsp;It is time to see your candidates.</p>

### 입력

<p>The name of a premium user, his or her gender preference, and maximum geographical distance are given, separated by a space, in the first line. The maximum geographical distance is an integer.&nbsp;&nbsp;The gender preference is one of &#39;F&#39;, &#39;FM&#39;, &#39;M&#39;, and &#39;MF&#39;, representing user&#39;s preference about two traditional genders; female(denoted by &#39;F&#39;) and male(denoted by &#39;M&#39;). Both &#39;FM&#39; and &#39;MF&#39; represent that the user prefers both genders.</p>

<p>In the second line, the number of users, &nbsp;1 &le; 𝑁 &le; 100,000, is given. For next $N$ lines, the name of a&nbsp;user who liked the premium user, his or her gender(denoted by either &#39;F&#39; or &#39;M&#39;), and the geographical distance to the premium user are given in each line, separated by a space.</p>

<p>All the names&nbsp;consist only of alphabet&nbsp;characters and their length is not greater than 10. If there are duplicative names, print as many as they appear.</p>

<p>All the geographical distances and the user&#39;s limit of it are represented as an integer&nbsp;between 1 and 20,000&nbsp;inclusive.</p>

### 출력

<p>Print the name of users who meet the gender preference and geographical condition of the premium user, in lexicographical order, line by line.</p>

<p>If there is no user who meets them, print &quot;No one yet&quot;.</p>