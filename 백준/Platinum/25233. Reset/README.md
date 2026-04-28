# [Platinum I] Reset - 25233

[문제 링크](https://www.acmicpc.net/problem/25233)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 268, 정답: 40, 맞힌 사람: 32, 정답 비율: 18.824%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<figure style="float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25233.%E2%80%85Reset/22efa5d0.png" data-original-src="https://upload.acmicpc.net/808fa4e2-2df5-4d1f-bd34-f2a356ba9273/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 116px;" />
<figcaption>
<p style="text-align: right;"><small>Image from <a href="http://pngimg.com/image/41189">pngimg.com</a></small></p>
</figcaption>
</figure>

<p>Li and Xiao are involved in a supernatural event in which a crisis will happen at a fixed time in the future. They must complete a number of tasks to prevent the crisis from happening. Once they start a task, they must finish it before switching to another task. Tasks can be completed in any order.</p>

<p>On their first attempt, there may not be enough time for Li and Xiao to complete all the tasks before the crisis hits. The crisis will happen if any task is not completed in time, and Li and Xiao will die. Fortunately, at the moment of their death, the world will be <em>reset</em>: time is rewound to zero and Li and Xiao can have another attempt. All task progress will be lost upon a reset.</p>

<p>Li and Xiao can choose to research a task and gain experience in the task. For each full second Li and Xiao spend researching a task (they cannot spend a partial second on research), their completion time for that task will be reduced by some number of seconds. When the time is reduced to zero, Li and Xiao can complete the task instantly. Upon a reset, their experience from task research remains intact, and in their next attempt they will be able to complete the tasks more quickly. However, there is a constraint that each task can be researched at most once in each attempt.</p>

<p>Witnessing the crisis repeatedly (and therefore dying repeatedly) is not fun. Li and Xiao therefore want to minimize the number of resets they go through before they eventually prevent the crisis.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \leq n \leq 2 \cdot 10^5$) and $c$ ($1 \leq c \leq 10^9$), where $n$ is the number of tasks that Li and Xiao must complete, and $c$ is the number of seconds until the crisis occurs.</p>

<p>Each of the next $n$ lines contains two integers $t$ and $d$ ($1 \leq d \leq t \leq 10^9$) which describe a task, where $t$ is the initial time required to complete the given task. If Li and Xiao research the task for one second, the amount of time to complete it is reduced by $d$; if this would cause the task completion time to become negative, it is reduced to $0$.</p>

### 출력

<p>Output a single integer, the minimum number of resets required to complete all tasks and prevent the crisis.</p>