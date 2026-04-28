# [Gold II] Learning by Example - 10658

[문제 링크](https://www.acmicpc.net/problem/10658)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 262, 정답: 65, 맞힌 사람: 60, 정답 비율: 31.250%

### 분류

수학, 정렬, 많은 조건 분기, 스위핑

### 문제 설명

<p>Farmer John has been reading all about the exciting field of machine learning, where one can learn interesting and sometimes unexpected patterns by analyzing large data (he has even started calling one of the fields on his farm the &quot;field of machine learning&quot;!). &nbsp;FJ decides to use data about his existing cow herd to build an automatic classifier that can guess whether a cow will have spots or not.</p>

<p>Unfortunately, FJ hasn&#39;t been very good at keeping track of data about his cows. &nbsp;For each of his N cows (1 &lt;= N &lt;= 50,000), all he knows is the weight of the cow, and whether the cow has spots. &nbsp;Each of his cows has a distinct weight. &nbsp;Given this data, he builds what is called a &quot;nearest neighbor classifier&quot;. &nbsp;To guess whether a new cow C will have spots or not, FJ first finds the cow C&#39; in his herd with weight closest to that of C. &nbsp;If C&#39; has spots, then FJ guesses that C will also have spots; if C&#39; has no spots, FJ guesses the same for C. &nbsp;If there is not one unique nearest neighbor C&#39; but rather a tie between two of FJ&#39;s cows, then FJ guesses that C will have spots if one or both these nearest neighbors has spots.</p>

<p>FJ wants to test his new automatic spot predictor on a group of new cows that are just arriving at his farm. &nbsp;After weighing these cows, he sees that the new shipment of cows contains a cow of every integer weight between A and B (inclusive). &nbsp;Please determine how many of these cows will be classified as having spots, using FJ&#39;s new classifier. &nbsp;Note that the classifier only makes decisions using data from FJ&#39;s N existing cows, not any of the new cows. &nbsp;Also note that since A and B can both be quite large, your program will not likely run fast enough if it loops from A to B counting by ones.</p>

### 입력

<p>The first line of the input contains three integers N, A, and B (1 &lt;= A &lt;= B &lt;= 1,000,000,000).</p>

<p>The next N lines each describe a single cow. &nbsp;Each line contains either S W, indicating a spotted cow of weight W, or NS W, indicating a non-spotted cow of weight W. &nbsp;Weights are all integers in the range 1 ... 1,000,000,000.&nbsp;</p>

### 출력

<p>A single integer giving the number of incoming cows that FJ&#39;s algorithm will classify as having spots. &nbsp;In the example shown here, the incoming cows of weights 1, 2, 7, 8, 9, and 10 &nbsp;will all be classified as having spots.</p>