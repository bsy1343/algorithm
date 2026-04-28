# [Platinum V] 모자 쓴 아이들 (Small) - 12433

[문제 링크](https://www.acmicpc.net/problem/12433)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 5, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

조합론, 다이나믹 프로그래밍, 구현, 수학

### 문제 설명

<p>계단에 그림과 같이 검은색 혹은 흰색 모자를 쓴 아이들이 서 있다. 아이들은 계단 아래쪽만 볼 수 있고 전체 검은색 모자와 흰색 모자의 개수를 각각 알고 있다. 아이들보다 모자가 많아서, 모자가 남을 수 있는데, 이 경우 아이들이 쓰고 있지 않은 모자는 인솔자가 감추고 있다. 인솔자는 계단 맨 위에 있는 아이부터 차례차례 자신이 쓰고 있는 모자의 색을 알 수 있는지 물어보았고, 한 아이가 정답을 맞혔다. (즉 자신이 쓰고 있는 모자의 색을 맞혔다.) 정답을 맞힌 아이가 나온 후에는 그 앞에 있는 아이들에게는 더 이상 물어보지 않았다.</p>

<p><img src="%EB%B0%B1%EC%A4%80/Platinum/12433.%E2%80%85%EB%AA%A8%EC%9E%90%E2%80%85%EC%93%B4%E2%80%85%EC%95%84%EC%9D%B4%EB%93%A4%E2%80%85(Small)/49173409.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12433/images-41.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="vertical-align:middle" /></p>

<p>위 그림은 3명의 아이가 검은색/흰색 모자가 각각 2개인 상황에 뒤에서부터 2번째 아이가 정답을 말한 경우이다.</p>

<ul>
	<li>맨 뒤에 있는 아이가 볼 수 있는 것은, 검은색 모자 하나와 흰색 모자 하나이다. 만약 앞에 있는 아이가 둘 다 검은색의 모자를 쓰고 있었다면, 흰색 모자만 남기 때문에 자신이 흰색 모자를 쓰고 있다는 것을 알았을 것이다. 둘 다 흰색 모자를 쓰고 있을 때에도 자기 모자 색을 알 수 있었을 테지만 그렇지 않기 때문에 자신의 모자를 알 수 없다.</li>
	<li>두 번째 아이는 만일 자기 모자 색이 검은색이었다면 맨 뒤에 있는 아이가 자기 모자 색이 흰색인 것을 맞췄을 것이기 때문에 자기 모자 색이 흰색이라는 것을 알 수 있다.</li>
</ul>

<p>&nbsp;</p>

<p>당신은 이 상황에 대해 친구에게 전해 들었다. 친구는 상황이 정확히 어땠는지는 기억하지 못하고, 다만 아이들의 수와 검은색/흰색 모자의 수, 그리고 뒤에서 몇 번째 아이가 답을 맞혔는지만 알려주었다. 당신은 친구가 얘기해 준 정보에 맞는 경우의 수가 궁금해졌다. 이 경우의 수는 물론 매우 클 수 있기 때문에 32749로 나눈 나머지를 구하기로 한다.</p>

### 입력

<p>입력의 첫 줄에는 테스트 케이스의 숫자&nbsp;<strong>T</strong>가 주어진다. 아래로 T 줄의 입력이 주어지며 각 줄은 하나의 테스트 케이스에 대한 입력이다. 각 테스트 케이스는 아래와 같이 4개의 자연수로 주어진다.</p>

<pre>
B W k i</pre>

<p>여기에서&nbsp;<strong>B</strong>와&nbsp;<strong>W</strong>는 각각 검은색 모자와 흰색 모자의 수,&nbsp;<strong>k</strong>는 아이들의 수, 그리고&nbsp;<strong>i</strong>는 뒤에서 몇 번째 아이가 맞췄는지를 나타낸다.</p>

<h3>제한</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>B</strong>,&nbsp;<strong>W</strong>.</li>
	<li><strong>k</strong>&nbsp;&le;&nbsp;<strong>B</strong>&nbsp;+&nbsp;<strong>W</strong>.</li>
	<li>1 &le;&nbsp;<strong>i</strong>&nbsp;&le;&nbsp;<strong>k</strong>.</li>
	<li><strong>B</strong>,&nbsp;<strong>W</strong>,&nbsp;<strong>k</strong>&nbsp;&le; 20.</li>
</ul>

### 출력

<p>각 테스트 케이스에 대한 출력은 &quot;Case #x: y&quot; 형태로 이루어져야 한다. x는 1부터 시작되는 케이스 번호이고, y는 주어진 조건에 맞는 경우의 수를 32749로 나눈 나머지이다.</p>