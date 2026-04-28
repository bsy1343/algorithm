# [Platinum I] 브런치북 - 22989

[문제 링크](https://www.acmicpc.net/problem/22989)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 33, 정답: 24, 맞힌 사람: 23, 정답 비율: 74.194%

### 분류

구현, 매개 변수 탐색, 재귀

### 문제 설명

<table cellpadding="1" cellspacing="1" class="table table table-bordered" style="width: auto; margin-right: 20px; margin-left: auto; border:none;">
	<tbody>
		<tr>
			<td style="text-align: right; padding: 10px; line-height: 2.0;  border-left: none; border-right: none; border-top: none; border-bottom: 1px solid black;"><em>You can make anything by writing.<br />
			- C.S.Lewis</em></td>
		</tr>
	</tbody>
</table>

<p>좋은 글은 수많은 사람에게 영향을 미치고, 시간이 지나 다시 읽어도 그 가치가 오롯이 살아있다. 카카오에서 운영하는 &ldquo;브런치&rdquo;는 좋은 글을 쓰고 싶은 모든 이들을 위해 준비한 서비스이다.</p>

<p>브런치는 언제 어디서나 글감을 기록하고, 어디에서나 멋지게 글을 읽을 수 있도록 모든 디바이스에서 글을 작성, 수정하고 읽을 수 있다. 이렇게 작성한 글 들을 주제별로, 혹은 같은 관심사를 다른 작가와 함께 묶어서 연재할 수 있는 &ldquo;매거진&rdquo;을 만들 수 있다. 매거진에 펼쳐둔 아이디어를 섬세하게 다듬어서 &ldquo;브런치북&rdquo;을 만들어 자신만의 고유한 원작을 만들 수 있고, 브런치팀은 이 원작이 책으로, 강연으로, 또 새로운 2차 저작물로 재탄생하는 과정을 지원해 준다.</p>

<p>능력 있는 프로그래머이면서 동시에 심금을 울리는 글솜씨로 모두를 사로잡는 시인 종서도 최신 트렌드에 맞춰 브런치에 자신의 시를 올리기로 했다. 글을 읽어본 희원은 종서가 브런치북으로 시집을 출판했으면 좋겠다고 생각해서, $T$ 개의 시를 선택했다. 종서가 브런치북을 작업하다가 희원이 예상외의 시를 선택했다는 생각이 들어서 얘기해 본 결과, 희원이 시를 다운로드 받은 후 사용하는 제목 정렬 방식이 종서의 환경과 다르다는 것을 알았다.</p>

<p>예를 들어서, $a$ 번째 책의 $b$ 번째 시에 <span style="color:#e74c3c;"><code>Book</code>$a$<code>Poem</code>$b$</span>와 같은 제목이 붙어있다고 하자. $2$번째 책의 $10$번째 시에는 <span style="color:#e74c3c;"><code>Book2Poem10</code></span>, $10$번째 책의 $1$번째 시에는 <span style="color:#e74c3c;"><code>Book10Poem1</code></span>이란 제목이 붙을 것이다. 종서가 사용한 일반적으로 프로그래밍에서 사용하는 문자열 비교는 앞에서부터 시작해서 비교해가며, 서로 다른 문자가 나왔을 때 해당 문자의 비교로 문자열 비교를 한다. 여기서는 처음으로 다른 문자가 등장하는 $5$번째 문자에서 <span style="color:#e74c3c;"><code>2</code></span>가 <span style="color:#e74c3c;"><code>1</code></span>보다 크기 때문에, <span style="color:#e74c3c;"><code>Book2Poem10</code></span>이 <span style="color:#e74c3c;"><code>Book10Poem1</code></span>보다 더 크다. 하지만 각 시가 $2$번째와 $10$번째 책의 시라는 사실을 알고 있으면, $10$번째 책의 시가 더 크도록 비교해야 자연스러울 것이다.</p>

<p>그래서 희원은 다른 곳에서 많이 사용하는 자연스러운 문자열 비교를 사용해서 책의 제목을 정렬했다. 해당 문자열 비교에서는 먼저 대문자가 있는 경우에 모두 소문자로 고친다. 그 후, 연속된 숫자를 묶어서 수로 생각해서 비교한다. 앞에서부터 문자를 확인하면서 양쪽이 모두 숫자면 해당 숫자가 속해있는 수를, 그렇지 않으면 두 문자를 사용해서 비교한다. <span style="color:#e74c3c;"><code>0</code></span>으로 시작하는 수의 경우에는 두 수의 크기가 같다면 <span style="color:#e74c3c;"><code>0</code></span>의 개수가 많은 문자열이 더 작다. 다음은 해당 문자열 비교를 사용하여 제목을 비교한 예이다: <span style="color:#e74c3c;"><code>005a</code></span> $&lt;$ <span style="color:#e74c3c;"><code>05ab</code></span> $&lt;$ <span style="color:#e74c3c;"><code>5abc</code></span> $&lt;$ <span style="color:#e74c3c;"><code>5bcd</code></span> $&lt;$ <span style="color:#e74c3c;"><code>006a</code></span>&nbsp;$&lt;$ <span style="color:#e74c3c;"><code>6abc</code></span> $&lt;$ <span style="color:#e74c3c;"><code>10ab</code></span> $&lt;$ <span style="color:#e74c3c;"><code>abcd</code></span>.</p>

<p>종서는 $X$ 번째 날에 $16^X$ 개의 시를 썼고, 각 시의 제목은 각 문자가 <span style="color:#e74c3c;"><code>0123456789abcdef</code></span> 중 하나로 이루어진 $X$자리 문자열 전부를 중복 없이 사용했다. 희원은 $T$ 개의 시 중 $i$ 번째 시는 $N_i$ 번째 날에 작업한 $K_i$ 번째 시가 좋을 것 같다고 말했다. 여기서 희원이 말한 의미는 $N_i$ 번째 날의 모든 시 $16^{N_i}$ 개의 제목을 자연스러운 문자열 비교로 정렬했을 때 $K_i$ 번째 시라는 의미였기 때문에, 종서가 일반적으로 프로그래밍에서 사용하는 문자열 비교와 다른 책을 가리키는 경우가 있었다. 평소 같았으면 직접 프로그램을 작성해서 시의 제목을 알아보았을 종서지만, 브런치북 작업을 빨리 진행하고 싶었기 때문에 당신에게 희원이 선택한 각 시의 제목을 알려줬으면 좋겠다는 부탁을 했다.</p>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;">
<p>$T$</p>

<p>$N_1$ $K_1$</p>

<p>$\dots$</p>

<p>$N_T$ $K_T$</p>
</div>

<ul>
	<li>$T$은 희원이 고른 시의 수이다. ($1 \le T \le 1\,000$)</li>
	<li>$N_i$와 $K_i$는 희원이 고른 시의 정보를 나타낸다. $i$ 번째로 선택한 시가 $N_i$ 번째 날의 모든 시를 $16^{N_i}$ 개를 자연스러운 문자열 비교로 정렬했을 때 $K_i$ 번째 시라는 의미이다. ($1 \le N_i \le 15$, $1 \le K_i \le 16^{N_i}$)</li>
	<li>입력으로 주어지는 모든 수는 정수다.</li>
</ul>

### 출력

<p>총 $N$ 개의 줄을 출력한다. $i$ 번째 줄에는 희원이 선택한 $i$ 번째 시의 제목을 출력한다.</p>