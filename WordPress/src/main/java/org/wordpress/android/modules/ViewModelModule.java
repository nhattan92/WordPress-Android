package org.wordpress.android.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import org.wordpress.android.ui.JetpackRemoteInstallViewModel;
import org.wordpress.android.ui.reader.viewmodels.ReaderPostListViewModel;
import org.wordpress.android.ui.stats.refresh.StatsViewModel;
import org.wordpress.android.ui.stats.refresh.lists.sections.granular.DaysListViewModel;
import org.wordpress.android.ui.stats.refresh.lists.sections.granular.MonthsListViewModel;
import org.wordpress.android.ui.stats.refresh.lists.sections.granular.WeeksListViewModel;
import org.wordpress.android.ui.stats.refresh.lists.sections.granular.YearsListViewModel;
import org.wordpress.android.ui.stats.refresh.lists.sections.insights.InsightsListViewModel;
import org.wordpress.android.viewmodel.ViewModelFactory;
import org.wordpress.android.viewmodel.ViewModelKey;
import org.wordpress.android.viewmodel.activitylog.ActivityLogDetailViewModel;
import org.wordpress.android.viewmodel.activitylog.ActivityLogViewModel;
import org.wordpress.android.viewmodel.giphy.GiphyPickerViewModel;
import org.wordpress.android.viewmodel.history.HistoryViewModel;
import org.wordpress.android.viewmodel.pages.PageListViewModel;
import org.wordpress.android.viewmodel.pages.PageParentViewModel;
import org.wordpress.android.viewmodel.pages.PagesViewModel;
import org.wordpress.android.viewmodel.pages.SearchListViewModel;
import org.wordpress.android.viewmodel.plugins.PluginBrowserViewModel;
import org.wordpress.android.viewmodel.posts.PostListViewModel;
import org.wordpress.android.viewmodel.quickstart.QuickStartViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PluginBrowserViewModel.class)
    abstract ViewModel pluginBrowserViewModel(PluginBrowserViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ActivityLogViewModel.class)
    abstract ViewModel activityLogViewModel(ActivityLogViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ActivityLogDetailViewModel.class)
    abstract ViewModel activityLogDetailViewModel(ActivityLogDetailViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PagesViewModel.class)
    abstract ViewModel pagesViewModel(PagesViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(SearchListViewModel.class)
    abstract ViewModel searchListViewModel(SearchListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PageListViewModel.class)
    abstract ViewModel pageListViewModel(PageListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PageParentViewModel.class)
    abstract ViewModel pageParentViewModel(PageParentViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ReaderPostListViewModel.class)
    abstract ViewModel readerPostListViewModel(ReaderPostListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(JetpackRemoteInstallViewModel.class)
    abstract ViewModel jetpackRemoteInstallViewModel(JetpackRemoteInstallViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(QuickStartViewModel.class)
    abstract ViewModel quickStartViewModel(QuickStartViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(InsightsListViewModel.class)
    abstract ViewModel insightsTabViewModel(InsightsListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DaysListViewModel.class)
    abstract ViewModel daysTabViewModel(DaysListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(WeeksListViewModel.class)
    abstract ViewModel weeksTabViewModel(WeeksListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(MonthsListViewModel.class)
    abstract ViewModel monthsTabViewModel(MonthsListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(YearsListViewModel.class)
    abstract ViewModel yearsTabViewModel(YearsListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(StatsViewModel.class)
    abstract ViewModel statsViewModel(StatsViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HistoryViewModel.class)
    abstract ViewModel historyViewModel(HistoryViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostListViewModel.class)
    abstract ViewModel postListViewModel(PostListViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(GiphyPickerViewModel.class)
    abstract ViewModel giphyPickerViewModel(GiphyPickerViewModel viewModel);

    @Binds
    abstract ViewModelProvider.Factory provideViewModelFactory(ViewModelFactory viewModelFactory);
}
