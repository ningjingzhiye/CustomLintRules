package com.dedao.lints;

import com.android.tools.lint.client.api.IssueRegistry;
import com.android.tools.lint.detector.api.Issue;

import java.util.Arrays;
import java.util.List;

public class MyIssueRegistry extends IssueRegistry {
    public MyIssueRegistry() {
    }

    @Override
    public List<Issue> getIssues() {
        return Arrays.asList(
                AutoPointerLayoutDetector.ISSUE_INCLUDE,
                AutoPointerLayoutDetector.ISSUE_MERGE,
                AutoPointerLayoutDetector.ISSUE_VIEWSTUB,
                AutoPointerAdapterDetector.ISSUE_RECYCLER_ADAPTER,
                AutoPointerFileDetector.ISSUE_NO_FILE,
                AutoPointerFileDetector.ISSUE_UN_REGISTER_VIEW,
                AutoPointerLayoutInflaterDetector.ISSUE_LAYOUTINFLATER
        );
    }

}
