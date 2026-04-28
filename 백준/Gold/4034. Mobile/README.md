# [Gold III] Mobile - 4034

[문제 링크](https://www.acmicpc.net/problem/4034)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

수학, 트리, 정수론, 사칙연산, 재귀, 유클리드 호제법

### 문제 설명

<p>You&rsquo;ve probably seen mobiles suspended from the ceilings of museums or airports. We&rsquo;ll restrict ourselves to the type suspended from the ceiling by a single wire that is attached to a pivot point on an arm (also made of wire). At each end of the arm is either another wire suspending yet another arm, or a weight (usually in the form of some design). Below is one example, made by Alexander Calder, the best-known mobile artist.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4034.%E2%80%85Mobile/6547fe3e.png" data-original-src="https://www.acmicpc.net/upload/images2/mobile.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:left; height:206px; width:170px" />Some mobiles are simple and some are quite complex. Besides the artistry, these must balance. Recall that from a pivot point distance d<sub>L</sub> from the left and d<sub>R</sub> from the right, an arm will balance if the product of the weight at the left end and d<sub>L</sub> is equal to the product of the weight at the right end and d<sub>R</sub>. (We ignore the weight of the arm and the wires suspending the arms.)</p>

<p>For example, consider the mobile drawn below. If weight 1 weighs 8 units, then weights 2, 3, 4, and 5 must weigh 2, 6, 4, and 4 units respectively. In fact, if you know the structure of the mobile, that is, the arrangement of arms and where the pivot points are on each arm, and the value of one weight, you can determine the values of all the weights. That is your problem here &ndash; almost. It seems you only have weights that are integer valued. So, you&rsquo;ll be given the desired minimum value of one weight and determine the value of the other weights, so that those values will also be integers. Thus, it&rsquo;s possible that the specified minimum valued weight must be raised a little bit to accomplish this.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4034.%E2%80%85Mobile/aa3da124.png" data-original-src="https://www.acmicpc.net/upload/images2/mboile2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:263px; width:412px" /></p>

### 입력

<p>Input for each test case will start with a line containing the positive integer n, indicating the number of arms in the mobile. These arms are numbered 1 through n. The next n lines will describe the arms, in order 1, 2, . . . , n, and will be in the form</p>

<pre>
d<sub>L</sub> d<sub>R</sub> type<sub>L</sub> type<sub>R</sub> n<sub>L</sub> n<sub>R</sub></pre>

<p>where d<sub>L</sub> and d<sub>R</sub> are integers &le; 20 giving the distances from the pivot point to the left end and right end of the arm, type<sub>L</sub> and type<sub>R</sub> are each either W or A, indicating that a weight or arm hangs from the left or right ends, and n<sub>L</sub> and n<sub>R</sub> are the index numbers of the weight or arm on the left and right. The indices for the weights will start at 1 and be consecutive. The mobile will not have an arm that is hanging further down than 6 arms from the top. In our example above the lowest arm is 3 arms from the top.</p>

<p>Following the description of the arms is a line of the form m w, indicating that weight m weighs at least w, where 1 &le; w &le; 20.</p>

<p>A line containing a 0 follows the last test case</p>

### 출력

<p>For each test case output one line giving the minimum total weight of the mobile if weight m is at least w. Use the format given in the Sample Output. You may assume all output values will be less than 10<sup>9</sup>.</p>