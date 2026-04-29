# [Bronze I] 치매예방수칙 3.3.3 - 33709

[문제 링크](https://www.acmicpc.net/problem/33709)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 673, 정답: 530, 맞힌 사람: 479, 정답 비율: 79.700%

### 분류

문자열, 사칙연산, 수학, 파싱

### 문제 설명

<p>윤수는 산책하던 중 치매 예방 수칙을 홍보하는 포스터를 보게 되었다. 포스터에 적힌 치매 예방 슬로건 "치매 예방 수칙 3.3.3"을 보고, 치매를 예방하는 데 지켜야 할 총 수칙의 개수가 각 수칙을 구분자를 기준으로 분리한 후 모두 더해 $3 \text{+} 3 \text{+} 3$, 총 $9$개임을 알았다. 산책길에 본 다른 포스터들에서는 이 슬로건의 치매 예방 수칙의 개수를 <span style="color:#e74c3c;"><code>.</code></span> 뿐 아니라 <span style="color:#e74c3c;"><code>|</code></span>, <span style="color:#e74c3c;"><code>:</code></span>, <span style="color:#e74c3c;"><code>#</code></span>과 같이 다양한 문자를 사용해 구분하였다. 다양한 치매 예방 수칙 홍보 포스터를 관찰하던 윤수는 포스터의 슬로건이 다음 규칙을 따른다는 사실을 발견하였다.</p>

<ul>
	<li>슬로건의 길이는 $1000$자를 넘지 않고, 각 치매 예방 수칙의 개수는 $1$이상 $1000$이하이다. 각 치매 예방 수칙은 $0$으로 시작하지 않는다.</li>
	<li>각 치매 예방 수칙의 개수는 특수문자 한 자로 구분한다. 또한, 슬로건의 시작과 끝은 특수문자가 아니다.</li>
	<li>구분자는 특수문자로 <span style="color:#e74c3c;"><code>.</code></span>, <span style="color:#e74c3c;"><code>|</code></span>, <span style="color:#e74c3c;"><code>:</code></span>, <span style="color:#e74c3c;"><code>#</code></span> 네 가지 중 하나이다.</li>
</ul>

<p>치매 예방 슬로건이 주어졌을 때 치매를 막기 위해 지켜야 할 수칙의 총 개수를 구하시오.</p>

### 입력

<p>첫 번째 줄에 치매 예방 슬로건의 길이 $N$이 주어진다.</p>

<p>두 번째 줄에 본문에 주어진 규칙을 따르는 슬로건이 문자열로 주어진다.</p>

### 출력

<p>첫 번째 줄에 치매를 막기 위해 지켜야 할 수칙의 총 개수를 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 1\,000$</li>
	<li>입력으로 주어지는 모든 수는 정수이다.</li>
</ul>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/33709.%E2%80%85%EC%B9%98%EB%A7%A4%EC%98%88%EB%B0%A9%EC%88%98%EC%B9%99%E2%80%853.3.3/f49a6059.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33709-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 50%; width: 50%;"></p>