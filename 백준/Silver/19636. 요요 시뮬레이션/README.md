# [Silver IV] 요요 시뮬레이션 - 19636

[문제 링크](https://www.acmicpc.net/problem/19636)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 2086, 정답: 641, 맞힌 사람: 432, 정답 비율: 28.609%

### 분류

구현

### 문제 설명

<p>데시는 <em>D</em>일 동안 다이어트를 하기로 결심했다.</p>

<p>다이어트 전 데시의 체중은<em>&nbsp;W</em><sub>0</sub>&nbsp;g, 일일&nbsp;에너지 섭취량&nbsp;<em>I</em><sub>0</sub>&nbsp;Kcal, 일일&nbsp;기초 대사량은 일일&nbsp;에너지 섭취량과 같은<em>&nbsp;I</em><sub>0</sub>&nbsp;Kcal이다. 데시는 운동을 하지 않아 일일&nbsp;활동 대사량&nbsp;<em>A</em><sub>0</sub>은 0 Kcal이다.</p>

<p>다이어트 기간, 데시는 일일&nbsp;에너지 섭취량과 일일&nbsp;활동 대사량을 바꿀 것이다(물론 다이어트 전과 같을 수도 있다). 데시의 다이어트 기간 일일&nbsp;에너지 섭취량은&nbsp;<em>I</em>&nbsp;Kcal, 다이어트 기간 일일&nbsp;활동 대사량은&nbsp;<em>A</em>&nbsp;Kcal이다.</p>

<p>다이어트를 하는 동안 데시의 체중과 일일 기초 대사량은 변화한다. 단, 데시의 신체 구조는 매우 단순하여 체중과&nbsp;일일 기초 대사량은 각각 하루에 단 한 번만 변화한다.</p>

<p>체중은 (일일 에너지 섭취량 &minus; 일일 에너지 소비량) g/Kcal만큼 더해진다고 가정한다. 일일 에너지 소비량은 일일 기초 대사량과 일일 활동 대사량을 더한 값이다.</p>

<p>(일일 에너지 섭취량 &minus; 일일 에너지 소비량) 의 절댓값이 기초 대사량 변화 역치&nbsp;<em>T</em>&nbsp;Kcal 초과라면, 일일 기초 대사량은 &lfloor; (일일 에너지 섭취량 &minus; 일일 에너지 소비량) / 2 &rfloor; 만큼 더해진다. 일일 기초 대사량&nbsp;변화는 같은 날의 체중 변화 다음에 일어난다.</p>

<p>단, 아래에 해당하면 데시는 사망한다.</p>

<ul>
	<li>체중이 0 g 이하인 경우</li>
	<li>일일 기초 대사량이 0 Kcal 이하인 경우</li>
</ul>

<p><em>D</em>일 간의 다이어트가 끝난 후, 일일 기초 대사량의 변화를 고려하지 않았을 때와 일일 기초 대사량의 변화를 고려했을 때 각각의 예상 체중과 일일 기초 대사량을, 그리고&nbsp;다이어트 전 데시의 원래 생활로 돌아간다면&nbsp;몸무게가 증가하는 요요 현상이 일어날지&nbsp;계산해주자.</p>

### 입력

<p>첫 번째 줄에는 데시의 다이어트 전 체중&nbsp;<em>W</em><sub>0</sub>&nbsp;(1&nbsp;&le; <em>W</em><sub>0</sub>&nbsp;&le;&nbsp;10<sup>7</sup>), 다이어트 전 일일 에너지 섭취량 및 일일 기초 대사량&nbsp;<em>I</em><sub>0</sub>&nbsp;(1&le;&nbsp;<em>I</em><sub>0</sub>&nbsp;&le; 10<sup>5</sup>), 기초 대사량 변화 역치&nbsp;<em>T</em>&nbsp;(1 &le;&nbsp;<em>T</em>&nbsp;&le; 1,000)가 빈칸을 사이에 두고 주어진다.</p>

<p>두 번째 줄에는 데시의 다이어트 기간&nbsp;<em>D</em>&nbsp;(1&nbsp;&le;&nbsp;<em>D</em>&nbsp;&le; 1,000), 다이어트 기간 일일 에너지 섭취량&nbsp;<em>I</em>&nbsp;(0&nbsp;&le; <i>I</i>&nbsp;&le; 10<sup>5</sup>), 다이어트 기간 일일 활동 대사량&nbsp;<em>A</em> (0&nbsp;&le;&nbsp;<em>A</em>&nbsp;&le; 10<sup>5</sup>)가 빈칸을 사이에 두고 주어진다.</p>

<p>입력으로 주어지는 모든 수는 정수이며, 단위는 지문에서 언급한 단위를 따른다.&nbsp;다이어트 동안 체중이 오히려 증가하는 경우는 입력으로 주어지지 않는다.</p>

### 출력

<p>첫 번째 줄에는 일일 기초 대사량의 변화를 고려하지 않았을 때의 다이어트 후 예상 체중과 일일 기초 대사량을 출력한다. 일일 기초 대사량&nbsp;변화를 고려하지 않았으므로 다이어트 전 일일 기초 대사량을 그대로 출력하면 된다. 만약 다이어트 도중 데시의 사망이 예상되는 경우 체중과 일일 기초 대사량 대신 <span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">Danger Diet</span></code></span>를 출력한다.</p>

<p>두 번째 줄에는 일일 기초 대사량의 변화를 고려했을 때의 다이어트 후 예상 체중과 일일 기초 대사량을 출력하고, 변화한 일일 기초 대사량을 가지고 다이어트 전 일일 에너지 섭취량과 다이어트 전 일일 활동 대사량으로 돌아갔을 때 체중이 증가하는 요요 현상이 발생하는 경우&nbsp;<span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">YOYO</span></code></span>, 발생하지 않는 경우&nbsp;<span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">NO</span></code></span>를 출력한다. 만약 다이어트 도중 데시의 사망이 예상되는 경우 체중과 일일 기초 대사량, 요요 발생 여부 대신 <span style="color:#e74c3c;"><code><span style="background-color:#ecf0f1;">Danger Diet</span></code></span>를 출력한다.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/19636.%E2%80%85%EC%9A%94%EC%9A%94%E2%80%85%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98/c040a123.png" data-original-src="https://upload.acmicpc.net/4db2c200-ab14-49f9-8535-1b850568439b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="300px" /></p>

<p>다이어트 전 체중<em>&nbsp;W</em><sub>0</sub>이 100,000g, 일일 에너지 섭취량&nbsp;<em>I</em><sub>0</sub>이 1,500 Kcal인 경우, 다이어트 전 일일 기초 대사량은 일일 에너지 섭취량과 같은 1500 Kcal이다.</p>

<p>데시는 운동을 하지 않으므로 다이어트 전 일일 활동 대사량&nbsp;<em>A</em><sub>0</sub>은 0 Kcal이다.</p>

<p>일일 에너지 소비량은 일일 기초 대사량과 활동 대사량을 더한 값이므로 1,500 + 0 = 1,500 Kcal이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/19636.%E2%80%85%EC%9A%94%EC%9A%94%E2%80%85%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98/3aeefdb1.png" data-original-src="https://upload.acmicpc.net/bcdece0b-d644-4131-8458-c7de928f2992/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="400px" /></p>

<p>데시는 일일&nbsp;에너지 섭취량은 1,000 Kcal, 일일 활동 대사량은 700 Kcal로 바꾸는 다이어트를 5일 동안 할 것이다.</p>

<p>일일 에너지 소비량은 일일 기초 대사량과 일일 활동 대사량을 더한 값이므로 1,500 + 700 = 2,200 Kcal가 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/19636.%E2%80%85%EC%9A%94%EC%9A%94%E2%80%85%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98/84dd61ca.png" data-original-src="https://upload.acmicpc.net/c1b718f2-af73-447f-82d6-e88f992dca3c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="400px" /></p>

<p>체중은 (일일 에너지 섭취량 &minus; 일일 에너지 소비량) g/Kcal만큼 더해진다. 따라서 체중은 1,000 &minus; 2,200 = &minus;1,200 g만큼 더해져, 다이어트 1일 차의 최종 체중은 98,800 g이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/19636.%E2%80%85%EC%9A%94%EC%9A%94%E2%80%85%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98/0ae32db7.png" data-original-src="https://upload.acmicpc.net/bce83c35-e415-4bfa-ab2a-cb006bf071e6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="400px" /></p>

<p>일일 기초 대사량은 (일일 에너지 섭취량 &minus; 일일 에너지 소비량)&nbsp;의 절댓값이 기초 대사량 변화 역치 <em>T</em> Kcal 초과일 때 변화한다. (1,000 &minus; 2,200) Kcal의 절댓값 1,200 Kcal은 기초 대사량 변화 역치인 500 Kcal을 초과하므로, 일일 기초 대사량은 &lfloor; (일일 에너지 섭취량 &minus; 일일 에너지 소비량) / 2 &rfloor; 만큼 더해진다. 다이어트 1일 차의 최종 일일 기초 대사량은 900 Kcal가 된다. <strong>이때,&nbsp;음수의 나눗셈은 언어마다 다를 수 있으므로 주의한다. &lfloor;&minus;5 / 2&rfloor; 의 값은&nbsp;&minus;3이다. 자신이 사용하는 언어에서 &minus;3이 나오는지 확인을&nbsp;해보자.</strong></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/19636.%E2%80%85%EC%9A%94%EC%9A%94%E2%80%85%EC%8B%9C%EB%AE%AC%EB%A0%88%EC%9D%B4%EC%85%98/3acc9899.png" data-original-src="https://upload.acmicpc.net/f5026cff-cb24-4d29-9562-19e68687f121/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="700px" /></p>

<p>이를 5일 동안 반복하면 기초 대사량의 변화를 고려한 데시의 다이어트 후 체중은 97,300 g, 일일 기초 대사량은 600 Kcal가 된다.</p>